package com.szming.sm.service;

import com.szming.sm.entity.Department;

import java.util.List;

/**
 * @ClassName DepartmentService
 * @Description DepartmentService
 * @Author Chris
 * @Date 2020/11/18
 **/
public interface DepartmentService {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     */
    List<Department> selectAll();
}
