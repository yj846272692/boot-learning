package com.yj.orm.service;

import com.yj.orm.domain.Student;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @TableName t_clazz
 */
@Data
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

    private List<Student> students;

    private static final long serialVersionUID = 1L;
}