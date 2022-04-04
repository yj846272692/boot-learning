package com.yj.boot.listener;

import com.yj.boot.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: YG.
 * @Description: 自定义事件监听器方式2：使用@Component注解将该类装载入spring容器中
 * @Date: create in 2022/4/4
 */
@Component
@Slf4j
public class MyListener2 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 2:使用@Component注解将该类装载入spring容器中--监听到事件源：%s.", MyListener2.class.getName(), event.getSource()));
    }
}
