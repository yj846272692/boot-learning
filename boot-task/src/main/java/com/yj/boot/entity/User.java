package com.yj.boot.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/25
 */
@Data
@Builder
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer status;
    private String avatar;
}

