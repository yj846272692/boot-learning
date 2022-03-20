package com.yj.boot.model;

import lombok.Data;

import java.util.List;

/**
 * @Author: YG.
 * @Description: 每个Child有name、age属性还有Friends集合
 * @Date: create in 2022/3/14
 */
@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;
}
