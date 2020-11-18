package com.szming.sm.service.impl;

import com.szming.sm.dao.DepartmentDao;
import com.szming.sm.entity.Department;
import com.szming.sm.factory.Daofactory;
import com.szming.sm.service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentServiceImpl
 * @Description DepartmentServiceImpl
 * @Author Chris
 * @Date 2020/11/18
 **/
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentDao departmentDao = Daofactory.getDepartmentDaoInstance();

    @Override
    public List<Department> selectAll(){
        List<Department> departmentList = null;
        try{
            departmentList = departmentDao.getAll();
        }catch(SQLException e){
            System.err.print("查询院系信息出现异常");
        }
        return departmentList;
    }
}
