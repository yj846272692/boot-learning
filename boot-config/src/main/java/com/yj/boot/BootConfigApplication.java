package com.yj.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: YG.
 * @Description: 启动主类
 * @Date: create in 2022/3/14
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:bean.xml"})
@Slf4j
public class BootConfigApplication {
    public static void main(String[] args) {

        SpringApplication.run(BootConfigApplication.class, args);
        log.info("启动成功!");
    }
}
