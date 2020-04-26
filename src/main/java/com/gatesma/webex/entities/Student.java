package com.gatesma.webex.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright (C), 2020
 * FileName: Student
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/19 09:08
 * Description: 学生
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    // 学号
    private String sno;
    // 名字
    private String sname;
    // 学院
    private String dept;
    // 性别
    private String gender;
    // 年龄
    private Integer age;

    /**
     * 学生学习动作
     */
    public void study() {
        System.out.println("Student - Study （学生学习）");
    }


}
