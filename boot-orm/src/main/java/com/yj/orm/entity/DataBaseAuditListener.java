package com.yj.orm.entity;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Date;

@Component
@Slf4j
public class DataBaseAuditListener {

    /**
     * 新增数据时，填充创建时间
     */
    public void prePersist(Object object) throws IllegalArgumentException, IllegalAccessException {
        Class<?> aClass = object.getClass();
        try {
            // 填充创建时间
            addOperateTime(object, aClass, "createTime");
        } catch (NoSuchFieldException e) {
            log.error("反射获取属性异常:", e);
        }
    }

    public void preUpdate(Object object) throws IllegalArgumentException, IllegalArgumentException {
        Class<?> aClass = object.getClass();
        try {
            // 填充更新时间
            addOperateTime(object, aClass, "updateTime");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            log.error("反射获取属性异常:", e);
        }
    }


    /**
     * 填充操作时间
     *
     * @param object 入参
     * @param aClass 反射对象
     * @param propertyName 属性名（对应实体类中的属性）
     * @throws NoSuchFieldException 异常
     * @throws IllegalAccessException 异常
     */
    protected void addOperateTime(Object object, Class<?> aClass, String propertyName) throws
            NoSuchFieldException, IllegalAccessException {
        Field time = aClass.getDeclaredField(propertyName);
        time.setAccessible(true);
        // 获取time值
        Object createsTimeValue = time.get(object);
        if (createsTimeValue == null) {
            // 使用当前时间进行填充
            time.set(object, new Date());
        }
    }

    /**
     * 新增数据之后的操作
     */
    public void postPersist(Object object) throws IllegalArgumentException, IllegalAccessException {

    }

    /**
     * 更新数据之后的操作
     */
    public void postUpdate(Object object) throws IllegalArgumentException, IllegalAccessException {

    }
}