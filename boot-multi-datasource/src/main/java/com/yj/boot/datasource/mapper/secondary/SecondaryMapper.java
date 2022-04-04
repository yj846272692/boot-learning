package com.yj.boot.datasource.mapper.secondary;

import com.yj.boot.datasource.entity.BootUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: SecondaryMapper
 * @author: YG
 * @date: 2022-03-31
 **/
public interface SecondaryMapper {
    /**
     * 查询所有数据
     *
     * @return List<BootUser>
     */
    List<BootUser> selectAll();


    /**
     * 新增
     *
     * @param bootUser 入参
     */
    void insert(@Param("bootUser") BootUser bootUser);

}