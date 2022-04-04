package com.yj.boot.datasource.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/3/31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BootUser {
    private Integer id;
    private String name;
    private String detail;
}