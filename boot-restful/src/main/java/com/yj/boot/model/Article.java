package com.yj.boot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "article", schema = "test", catalog = "")
public class Article {
    private Integer id;
    private String name;
    private Double price;


    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getId() {
        return id;
    }
}
