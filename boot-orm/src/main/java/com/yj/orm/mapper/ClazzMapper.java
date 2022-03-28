package com.yj.orm.mapper;

import com.yj.orm.domain.Clazz;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @description 针对表【t_clazz】的数据库操作Mapper
 * @createDate 2022-03-28 12:36:02
 *
 */
@Mapper
public interface ClazzMapper {

    /**
     * 根据班级ID查询班级信息
     *
     * @param clazzId
     * @return
     */
    Clazz findOneByMany(int clazzId);


    /**
     * 根据班级id查询班级信息
     */
    Clazz getClazz(int clazzId);

}
