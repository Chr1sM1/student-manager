package com.szming.sm.service;

import com.szming.sm.factory.ServiceFactory;
import com.szming.sm.utils.ResultEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminServiceTest {
    private final AdminService adminService = ServiceFactory.getAdminServiceInstance();

    @Test
    public void adminLogin() {
        ResultEntity resultEntity = adminService.adminLogin("mzs0119@qq.com","123456");
        assertEquals(0,resultEntity.getCode());
        System.out.println(resultEntity);
    }
}