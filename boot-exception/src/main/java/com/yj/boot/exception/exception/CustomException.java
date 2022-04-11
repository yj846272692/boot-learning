package com.yj.boot.exception.exception;

import com.yj.boot.exception.enums.CustomExceptionType;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/11
 */
public class CustomException extends RuntimeException {
    /**
     * 异常错误编编码
     */
    private int code;
    /**
     * 异常信息
     */
    private String message;

    public CustomException() {

    }

    public CustomException(CustomExceptionType exceptionTypeEnum) {
        this.code = exceptionTypeEnum.getCode();
        this.message = exceptionTypeEnum.getDesc();
    }

    public CustomException(CustomExceptionType exceptionTypeEnum, String message) {
        this.code = exceptionTypeEnum.getCode();
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
