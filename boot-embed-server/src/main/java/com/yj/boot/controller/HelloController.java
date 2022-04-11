package com.yj.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/8
 */
@RestController
public class HelloController {
    @PostMapping("hello")
    public String getHello(){
        return "Hello World";
    }
    @GetMapping("hello")
    public String PostHello(){
        return "Hello World";
    }
}
