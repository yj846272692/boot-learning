package com.yj.boot.websocket.service;

import com.yj.boot.websocket.config.WebSocketServer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/18
 */
@Service
public class TaskService {

    @Resource
    private WebSocketServer webSocketServer;

//    @Scheduled(cron = "0 * 14 * * ?")
    @Scheduled(cron = "0/5 * * * * ?")
    public void realTimeAlarm() {
        webSocketServer.sendToMessageById(1, "下课啦！");
    }
}
