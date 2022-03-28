package com.yj.orm.service;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName t_course_student
 */
@Data
public class CourseStudent implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 学生id
     */
    private Integer studentId;

    private static final long serialVersionUID = 1L;
}