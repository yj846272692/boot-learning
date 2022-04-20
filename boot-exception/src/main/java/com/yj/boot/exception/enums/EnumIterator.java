package com.yj.boot.exception.enums;

/**
 * @Author: YG.
 * @Description: 枚举迭代
 * @Date: create in 2022/4/11
 */
public class EnumIterator {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color);
        }
    }
}
