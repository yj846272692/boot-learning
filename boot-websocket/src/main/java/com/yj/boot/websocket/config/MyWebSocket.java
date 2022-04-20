package com.yj.boot.websocket.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/18
 */
@ServerEndpoint(value = "/websocket")
@Component
@Slf4j
@Data
public class MyWebSocket {
    /**
     * 静态变量，用来记录当前在线的连接数
     */
    private static int onlineCount = 0;


    /**
     * concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
     */
    private static CopyOnWriteArraySet<MyWebSocket> webSocketSet = new CopyOnWriteArraySet<>();

    /**
     * 与某个客户端的连接会话，获取参数，发送数据
     */
    private Session session;

    /**
     * 连接建立成功调用的方法
     *
     * @param session 会话
     */
    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        String queryString = session.getQueryString();
        String nickename = queryString.split("=")[1];
        // 加入集合
        webSocketSet.add(this);
        // 增加在线人数
        addOnlineCount();
        log.info("有连接加入，当前连接数为：" + getOnlineCount());
        //向客户端发送一条消息：连接成功
        try {
            sendMessage("连接成功！！"+ nickename + "上线啦！");
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        webSocketSet.remove(this);
        // 减少在线人数
        subOnlineCount();
        log.info("有连接关闭，当前连接数为：" + getOnlineCount());
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 消息
     * @param session 会话
     */
    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        String queryString = session.getQueryString();
        String nickename = queryString.split("=")[1];
        log.info(nickename);
        log.info(message);
        // 群发消息
        broadcastInfo(nickename + "说:" + message);
    }

    @OnError
    public void onError(Throwable error) {
        log.error("发送错误， {}", error.getMessage());
        error.printStackTrace();
    }

    /**
     * 群发消息
     *
     * @param message 消息
     * @throws IOException IO异常
     */
    public static void broadcastInfo(String message) throws IOException {
        for (MyWebSocket item : webSocketSet) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
    }


    /**
     * 封装基础的发送信息操作
     *
     * @param message 入参消息
     * @throws IOException
     */
    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);

    }


    public static synchronized void addOnlineCount() {
        MyWebSocket.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        MyWebSocket.onlineCount--;
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }


}
