package com.yj.boot;

import com.yj.boot.event.MyEvent;
import com.yj.boot.listener.MyListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/4
 */
@SpringBootApplication
@ServletComponentScan
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        //装载监听
        context.addApplicationListener(new MyListener1());
        //发布事件
        context.publishEvent(new MyEvent("测试事件"));
    }
}
