package com.yj.boot.listener;

import com.yj.boot.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * @Author: YG.
 * @Description: 自定义事件监听器方式3：在application.yml中配置监听
 * @Date: create in 2022/4/4
 */
@Slf4j
public class MyListener3 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 3:在application.yml中配置监听--监听到事件源：%s.", MyListener3.class.getName(), event.getSource()));
    }
}
