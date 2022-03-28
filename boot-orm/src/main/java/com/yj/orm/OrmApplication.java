package com.yj.orm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author YangJING
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.yj.orm.mapper"})
public class OrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmApplication.class, args);
    }

}
