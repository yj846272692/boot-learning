package com.yj.boot.restful.model;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/3/10
 */
@Data
@Builder
public class Reader {
    private String name;
    private Integer age;
}
