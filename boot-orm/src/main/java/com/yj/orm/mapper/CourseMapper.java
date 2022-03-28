package com.yj.orm.mapper;

import com.yj.orm.domain.Course;
import com.yj.orm.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author Administrator
 * @description 针对表【t_course】的数据库操作Mapper
 * @createDate 2022-03-28 12:36:02
 * @Entity com.stf.bootmysqltest.domain.Course
 */
@Mapper
public interface CourseMapper {

    /**
     * 根据课程id关联查询课程信息
     *
     * @param courseId
     * @return
     */
    Course getCourse(int courseId);

}
