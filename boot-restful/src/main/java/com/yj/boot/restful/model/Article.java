package com.yj.boot.restful.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/3/10
 */
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonPropertyOrder(value={"content","title"})
public class Article {
    @JsonIgnore
    private Long id;
    //@JsonProperty("writer")
    private String author;
    private String title;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    private Date updateTime;

    private List<Reader> readerList;
}