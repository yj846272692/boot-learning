package com.yj.boot.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;


@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class BeanTest {
    //注入Spring上下文环境
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    void testLoadService() {
        // 从测试环境的Spring上下文中读取xml配置文件，得到 testBeanService,有的话 xml配置文件就生效
        // boolean flag = ioc.containsBean("testBeanService");
        if (ioc.containsBean("testBeanService")) {
            TestBeanService tbs = (TestBeanService) ioc.getBean("testBeanService");
            log.info("testBeanService name: {}", tbs.getName());
        }

        if (ioc.containsBean("testBeanService1")) {
            TestBeanService tbs = (TestBeanService) ioc.getBean("testBeanService1");
            log.info("testBeanService name: {}", tbs.getName1());
        }


    }
}