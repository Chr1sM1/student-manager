package com.szming.sm.service;

import com.szming.sm.utils.ResultEntity;

/**
 * @ClassName AdminService
 * @Description Admin业务逻辑口
 * @Author Chris
 * @Date 2020/11/15
 **/
public interface AdminService {
    /**
     * 管理员登陆
     *
     * @param account :账号
     * @param password : 密码
     * @return ResultEntity: 返回结果
     *
     */
    ResultEntity adminLogin(String account,String password);
}
