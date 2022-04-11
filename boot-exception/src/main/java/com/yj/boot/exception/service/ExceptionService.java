package com.yj.boot.exception.service;

import com.yj.boot.exception.consts.MsgConsts;
import com.yj.boot.exception.enums.CustomExceptionType;
import com.yj.boot.exception.exception.CustomException;
import org.springframework.stereotype.Service;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/11
 */
@Service
public class ExceptionService {
    /**
     * 服务层，模拟系统异常
     */
    public void systemBizError(int id) {
        throw new CustomException(CustomExceptionType.SYSTEM_ERROR, "输入数据不符合业务逻辑，请重新输入！");
    }

    /**
     * 服务层，模拟用户输入数据导致的校验异常
     *
     * @param input 用户输入
     */
    public void userBizError(int input) {
        //模拟业务校验失败逻辑
        if (input < 0) {
            throw new CustomException(
                    CustomExceptionType.USER_INPUT_ERROR, MsgConsts.INPUT_ERROR);
        }
    }

}
