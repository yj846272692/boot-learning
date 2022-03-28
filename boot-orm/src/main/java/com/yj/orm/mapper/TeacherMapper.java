package com.yj.orm.mapper;

import com.yj.orm.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【t_teacher】的数据库操作Mapper
* @createDate 2022-03-28 12:36:02
* @Entity com.stf.bootmysqltest.domain.Teacher
*/
@Mapper
public interface TeacherMapper {

    Teacher findOneByOne(Integer id);
}
