package com.szming.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Admin
 * @Description Admin实体类
 * @Author Chris
 * @Date 2020/11/15
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Admin {
    private Integer id;
    private String account;
    private String password;
    private String adminName;
}
