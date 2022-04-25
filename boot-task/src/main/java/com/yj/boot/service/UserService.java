package com.yj.boot.service;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/25
 */
public interface UserService {
    public void activeUser(Integer id);
    public String insertUser(String username,String password);
}
