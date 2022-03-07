package com.yj.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/3/7
 */
@RestController
@RequestMapping(value = "/api")
public class HelloController {
    @GetMapping(value = "/hello")
    public String getHello() {
        return " hello world";
    }
}
