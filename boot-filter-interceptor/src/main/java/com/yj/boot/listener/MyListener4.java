package com.yj.boot.listener;

import com.yj.boot.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: YG.
 * @Description: 自定义事件监听器方式4：使用@EventListener装饰具体方法
 * @Date: create in 2022/4/4
 */
@Slf4j
@Component
public class MyListener4 {
    @EventListener
    public void listener(MyEvent event) {
        log.info(String.format("%s 4:使用@EventListener装饰具体方法--监听到事件源：%s.", MyListener4.class.getName(), event.getSource()));
    }
}
