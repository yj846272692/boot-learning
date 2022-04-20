package com.yj.boot.websocket.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/18
 */
@ServerEndpoint(value = "/websocket/{id}")
@Component
@Slf4j
public class WebSocketServer {
    /**
     * 静态变量，用来记录当前在线的连接数
     */
    private static int onlineCount = 0;

    /**
     * concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
     */
    private static ConcurrentHashMap<Integer, WebSocketServer> webSocketSet = new ConcurrentHashMap<>();

    /**
     * 与某个客户端的连接会话，获取参数，发送数据
     */
    private Session session;

    /**
     * 传过来的id
     */
    private Integer id = 0;

    /**
     * 连接建立成功调用的方法
     *
     * @param session 会话
     */
    @OnOpen
    public void onOpen(@PathParam(value = "id") Integer param, Session session) {
        //接收到发送消息的人员编号
        this.id = param;
        this.session = session;
        //加入set
        webSocketSet.put(param, this);
        // 增加在线人数
        addOnlineCount();
        log.info("有连接加入，当前在线人数为：" + getOnlineCount());
        //向客户端发送一条消息：连接成功
        try {
            sendMessage("-连接已建立-");
        } catch (IOException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        if (id != null && id != 0) {
            webSocketSet.remove(id);
        }
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
    public void onMessage(String message, Session session) {
        log.info("来自客户端的消息：" + message);
        try {
            sendInfo(message);
            this.sendMessage(message);
        } catch (IOException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 错误时调用
     *
     * @param error
     */

    @OnError
    public void onError(Throwable error) {
        log.error("发送错误， {}", error.getMessage());
        error.printStackTrace();
    }

    public void sendMessage(String message) throws IOException {
        getSession().getBasicRemote().sendText(message);
    }

    /**
     * 给指定的人发消息
     */
    public void sendToMessageById(Integer id, String message) {
        try {
            if (webSocketSet.get(id) != null) {
                webSocketSet.get(id).sendMessage(message);
            } else {
                log.info("webSocketSet中没有此Key，不推送消息");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 群发自定义消息
     *
     * @param message
     * @throws IOException
     */
    public static void sendInfo(String message) throws IOException {
        for (WebSocketServer item : webSocketSet.values()) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                log.error(e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public Session getSession() {
        return session;
    }

    public static synchronized void addOnlineCount() {
        WebSocketServer.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        WebSocketServer.onlineCount--;
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }


}
