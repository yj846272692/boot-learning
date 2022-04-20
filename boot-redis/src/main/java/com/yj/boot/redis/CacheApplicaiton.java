package com.yj.boot.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/17
 */
@SpringBootApplication
@EnableCaching
public class CacheApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(CacheApplicaiton.class,args);
    }
}
