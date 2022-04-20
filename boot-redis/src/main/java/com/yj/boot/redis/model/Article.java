package com.yj.boot.redis.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
//@EntityListeners(DataBaseAuditListener.class)
public class Article implements Serializable {


    @Serial
    private static final long serialVersionUID = 5265144077323778649L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String author;

    private String title;

    private String thumbnail;
    private String content;

    @Column(name="create_time",updatable = false)
    private Date createTime;
    private Date updateTime;
}