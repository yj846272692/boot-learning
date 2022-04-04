package com.yj.boot.listener;

import com.yj.boot.event.MyEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class CustomListenerTest {
    @Resource
    private ApplicationContext context;

    @Test
    void testEvent() {
        //想在哪里发布事件，就在哪里发布
        context.publishEvent(new MyEvent("测试事件"));
    }

}