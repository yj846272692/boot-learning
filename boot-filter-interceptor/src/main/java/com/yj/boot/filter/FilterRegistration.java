package com.yj.boot.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/4
 */
@Configuration
public class FilterRegistration {
    @Bean
    public FilterRegistrationBean filterRegistrationBean1() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CustomFilter());

        registrationBean.setName("customFilter");

        registrationBean.addUrlPatterns("/*");

        registrationBean.setOrder(10);
        return registrationBean;
    }
    @Bean
    public FilterRegistrationBean filterRegistrationBean2() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFilter());

        registrationBean.setName("myFilter");

        registrationBean.addUrlPatterns("/*");

        registrationBean.setOrder(5);
        return registrationBean;
    }
}
