package com.szming.sm.factory;

import com.szming.sm.dao.AdminDao;
import com.szming.sm.dao.impl.AdminDaoImpl;
import com.szming.sm.dao.impl.DepartmentDaoImpl;

/**
 * @ClassName Daofactory
 * @Description 工厂类
 * @Author Chris
 * @Date 2020/11/15
 **/
public class Daofactory {
    /**
     * 获得AdminDao实例
     *
     * @return AdminDao实例
     */
    public static AdminDao getAdminDaoInstance(){
        return new AdminDaoImpl();
    }
    /**
     * 获得DepartmentDao实例
     *
     * @return AdminDao实例
     */
    public static DepartmentDaoImpl getDepartmentDaoInstance(){
        return new DepartmentDaoImpl();
    }
}
