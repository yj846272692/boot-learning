package com.yj.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/3/7
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private Integer id;
    private String name;

    private static Logger Logger = LoggerFactory.getLogger(Book.class);

    public void test() {
        Logger.info("info");
    }
}
