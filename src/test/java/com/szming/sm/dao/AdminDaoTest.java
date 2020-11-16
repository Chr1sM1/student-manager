package com.szming.sm.dao;

import com.szming.sm.entity.Admin;
import com.szming.sm.factory.Daofactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class AdminDaoTest {

    private final AdminDao adminDao = Daofactory.getAdminDaoInstance();

    @Test
    public void findAdminByAccount() {
        Admin admin;
        try {
            admin = adminDao.findAdminByAccount("mzs0119@qq.com");
            assertEquals("小明",admin.getAdminName());
            System.out.println(admin);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}