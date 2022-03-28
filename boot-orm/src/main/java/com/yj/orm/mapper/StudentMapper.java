package com.yj.orm.mapper;

import com.yj.orm.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 * @description 针对表【t_student】的数据库操作Mapper
 * @createDate 2022-03-28 12:36:02
 * @Entity com.stf.bootmysqltest.domain.Student
 */
@Mapper
public interface StudentMapper {
    /**
     * 根据学生id查询学生
     *
     * @param studentId 学生id
     * @return 学生信息（关联查询出其所在班级信息）
     */
    Student findManyByOne(int studentId);

    /**
     * 根据学生id查询学生
     *
     * @param studentId
     * @return 学生信息（关联查询出所在班级信息，其所选择的课程信息）
     */
    Student getStudent(int studentId);

    int insert(Student student);

    /**
     * 批量新增学生
     *
     * @param students
     * @return int
     */
    int batchInsert(@Param("students") List<Student> students);


    /**
     * 批量删除
     *
     * @param ids
     * @return int
     */
    int batchDelete(@Param("ids") List<Integer> ids);


    /**
     * 批量修改
     *
     * @param students
     * @return int ?
     */
    int batchUpdate(@Param("students") List<Student> students);

    /**
     * 动态查询
     *
     * @param student 查询对象
     * @return
     */
    List<Student> findStudentBy(@Param("student") Student student);
}
