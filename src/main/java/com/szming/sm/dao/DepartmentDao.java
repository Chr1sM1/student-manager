package com.szming.sm.dao;

import com.szming.sm.entity.Department;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentDao
 * @Description 院系Dao接口
 * @Author Chris
 * @Date 2020/11/17
 **/
public interface DepartmentDao {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     * @throws java.sql.SQLException 异常
     */
    List<Department> getAll() throws SQLException;
}
