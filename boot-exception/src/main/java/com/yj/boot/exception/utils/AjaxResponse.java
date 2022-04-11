package com.yj.boot.exception.utils;

import com.yj.boot.exception.enums.CustomExceptionType;
import com.yj.boot.exception.exception.CustomException;
import lombok.Data;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/11
 */
@Data
public class AjaxResponse {
    private int code;
    private String message;
    private Object data;

    private AjaxResponse() {
    }

    /**
     * 异常时的响应数据封装
     */
    public static AjaxResponse error(CustomException e) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(e.getCode());
        resultBean.setMessage(e.getMessage());
        return resultBean;
    }

    /**
     * 请求出现异常时的响应数据封装
     */
    public static AjaxResponse error(CustomExceptionType customExceptionType, String errorMessage) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(customExceptionType.getCode());
        resultBean.setMessage(errorMessage);
        return resultBean;
    }
    /**
     * 请求成功的响应
     */
    public static AjaxResponse success(Object obj){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setData(obj);
        return  ajaxResponse;
    }

    /**
     * 请求成功的响应
     */
    public static AjaxResponse success(Object obj ,String message){
        AjaxResponse ajaxResponse =  new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
}
