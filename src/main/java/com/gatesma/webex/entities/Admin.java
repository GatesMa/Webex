package com.gatesma.webex.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2020
 * FileName: admin
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/19 09:06
 * Description: 管理员
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    // 名称
    private String name;
    // 年龄
    private Integer age;
    // 性别
    private String gender;

    /**
     * 管理员登陆动作
     */
    public void Login() {
        System.out.println("Admin - 管理员 - Login - （管理员登陆）");
    }

}
