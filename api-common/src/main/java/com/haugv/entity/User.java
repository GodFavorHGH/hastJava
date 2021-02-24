package com.haugv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    /**唯一主键*/
    private int id;
    /**登陆名*/
    private String name;
    /**登陆密码*/
    private String password;
    /***/
    private String email;
    /***/
    private String phone;
    /***/
    private String status;
    /***/
    private String role;
    /***/
    private int level;
    /***/
    private int contribution;
    /***/
    private Timestamp createTime;
    /***/
    private Timestamp updateTime;

}
