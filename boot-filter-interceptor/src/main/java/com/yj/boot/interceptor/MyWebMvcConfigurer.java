package com.yj.boot.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/4
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    @Resource
    private CustomHandlerInterceptor customHandlerInterceptor;
    @Resource
    private AccessLogInterceptor accessLogInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器 拦截规则
        registry.addInterceptor(customHandlerInterceptor).addPathPatterns("/*");
        registry.addInterceptor(accessLogInterceptor).addPathPatterns("/*");
    }
}