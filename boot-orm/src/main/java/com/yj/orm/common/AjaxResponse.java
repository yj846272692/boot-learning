package com.yj.orm.common;

import lombok.Data;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/3/10
 */
@Data
public class AjaxResponse {
    private Integer code;
    private String message;
    private Object data;

    private AjaxResponse() {
    }

    /**
     * 请求成功响应：不带查询参数（删除，修改，新增的接口）
     *
     * @return AjaxResponse
     */
    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        return ajaxResponse;
    }

    /**
     * 请求成功响应：带返回数据
     * @param data 返回数据
     * @return
     */

    public static AjaxResponse success(Object data) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setData(data);
        return ajaxResponse;
    }

    public static AjaxResponse failed() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(400);
        ajaxResponse.setMessage("请求失败");
        return ajaxResponse;
    }
}
