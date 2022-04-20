package com.yj.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/15
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String getHello() {
        return "hello world";
    }
}
