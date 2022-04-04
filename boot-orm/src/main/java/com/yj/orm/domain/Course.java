package com.yj.orm.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * @TableName t_course
 */
@Data
@Alias("Course")
public class Course implements Serializable {
    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 课程名称
     */
    private String courseName;


    /**
     * 关联查询：查询课程时，关联查询出该课程的所有学生
     */
    private List<Student> studentList;

    private static final long serialVersionUID = 1L;
}