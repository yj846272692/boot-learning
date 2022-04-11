package com.yj.boot.exception.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    @Min(4)
    private Integer id;
    @NotNull(message = "标题不能为空")
    private String title;
}
