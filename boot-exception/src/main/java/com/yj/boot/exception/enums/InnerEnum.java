package com.yj.boot.exception.enums;

/**
 * @Author: YG.
 * @Description: 内部类中使用枚举
 * @Date: create in 2022/4/11
 */
public class InnerEnum {
    enum SEASON {
        /**
         * 颜色枚举
         */
        SPRING, SUMMER, AUTUMN, WINTER
    }

    public static void main(String[] args) {
        SEASON season = SEASON.SUMMER;
        System.out.println(season);
    }
}
