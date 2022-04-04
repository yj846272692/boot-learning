package com.yj.boot.datasource.mapper.primary;


import com.yj.boot.datasource.entity.BootUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: PrimaryMapper
 * @author: YG.
 * @date: 2022-03-30
 **/
public interface PrimaryMapper {
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
