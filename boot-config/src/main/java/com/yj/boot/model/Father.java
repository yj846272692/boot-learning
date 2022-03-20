package com.yj.boot.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/3/14
 */
@Data
public class Father {
    private String name;

    @Min(value = 22 , message = "年龄不能超过22岁！")
    private Integer age;

    @Email
    private String email;
}
