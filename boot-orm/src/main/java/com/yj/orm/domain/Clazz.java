package com.yj.orm.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * @TableName t_clazz
 */
@Data
@Alias("Clazz")
public class Clazz implements Serializable {
    /**
     * 班级id
     */
    private Integer clazzId;

    /**
     * 班级名称
     */
    private String clazzName;

    /**
     * 班级管理老师的id
     */
    private Integer teacherId;


    /**
     * 管理老师的id（一对一）
     */
    private Teacher teacher;

    /**
     * 班级里的所有学生：一方中声明多方的集合(一对多)
     */
    private List<Student> students;

    private static final long serialVersionUID = 1L;
}