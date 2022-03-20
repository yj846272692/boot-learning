package com.yj.boot.model;

import com.yj.boot.util.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/3/14
 */
@Data
@Component
@Validated
// 配置整体的前缀
@ConfigurationProperties(prefix = "user")
@PropertySource(value = {"classpath:user.yaml"}, factory = MixPropertySourceFactory.class)
public class User {

    private String name;

    private Integer age;

    @Valid
    private Book book;
}