package com.yj.boot.entity.dto;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/25
 */
@Data
public class UserDto {
    @Pattern(regexp = "([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$", message = "请输入正确的邮箱")
    private String username;

    @Length(min = 6, max = 20, message = "密码必须在6-20位之间")
    private String password;
}
