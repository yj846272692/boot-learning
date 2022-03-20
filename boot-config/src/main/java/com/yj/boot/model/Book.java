package com.yj.boot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/3/14
 */
@Data
public class Book {

    private String name;
    @Min(value = 10, message = "价格不能低于10元")
    private Integer price;

    @Past
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}
