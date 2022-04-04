package com.yj.boot.listener;

import com.yj.boot.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * @Author: YG.
 * @Description: 自定义事件监听器方式1：实现ApplicationListener接口
 * @Date: create in 2022/4/4
 */
@Slf4j
public class MyListener1 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 监听到事件源：%s.", MyListener1.class.getName(), event.getSource()));
    }
}
