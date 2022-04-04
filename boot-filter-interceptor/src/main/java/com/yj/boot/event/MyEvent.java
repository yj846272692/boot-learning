package com.yj.boot.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: YG.
 * @Description: 自定义事件
 * @Date: create in 2022/4/4
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}
