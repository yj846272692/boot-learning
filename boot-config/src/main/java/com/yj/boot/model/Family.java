package com.yj.boot.model;


import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @Author: YG.
 * @Description: 务必注意 成员变量名 要和yml配置项的key一一对应
 * @Date: create in 2022/3/14
 */

@Data
@Component
//配置整体的前缀
@ConfigurationProperties(prefix = "family")
//数据绑定校验
@Validated
//加载额外配置文件
@PropertySource(value = {"classpath:family.properties"})
public class Family {
    @Length(min = 5 ,max = 20 , message = "家庭名称必须在5-20位之间")
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;
}
