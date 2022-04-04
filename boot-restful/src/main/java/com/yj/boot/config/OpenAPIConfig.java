package com.yj.boot.config;


import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/1
 */
@Configuration
public class OpenAPIConfig {
    @Bean
    public GroupedOpenApi articleApi() {
        return GroupedOpenApi.builder().group("articles").pathsToMatch("/articles/**").build();
    }

    @Bean
    public GroupedOpenApi helloApi() {
        return GroupedOpenApi.builder().group("hello").pathsToMatch("/hello/**").build();
    }
}