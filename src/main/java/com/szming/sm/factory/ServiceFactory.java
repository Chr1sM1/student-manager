package com.szming.sm.factory;

import com.szming.sm.service.AdminService;
import com.szming.sm.service.DepartmentService;
import com.szming.sm.service.impl.AdminServiceImpl;
import com.szming.sm.service.impl.DepartmentServiceImpl;

/**
 * @ClassName ServiceFactory
 * @Description Service工厂类
 * @Author Chris
 * @Date 2020/11/16
 **/
public class ServiceFactory {
    public static AdminService getAdminServiceInstance(){
        return new AdminServiceImpl();
    }

    public static DepartmentService getDepartmentServiceInstance(){
        return new DepartmentServiceImpl();
    }
}
