package com.yj.orm.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName t_student
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 学生所属班级的id
     */
    private Integer clazzId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 学生籍贯
     */
    private String hometown;

    /**
     * 出生日期
     */
    private Date birthday;

    private static final long serialVersionUID = 1L;
}