package com.gatesma.webex.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2020
 * FileName: Teacher
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/19 09:11
 * Description: 老师
 */
@Component("teacher")
@Scope("prototype")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    // 名称
    @Value("陈杰")
    private String name;
    // 老师工号
    @Value("1234567890")
    private String tno;
    // 老师所教课程
    @Value("Web技术与实践")
    private String course;

    /**
     * 老师备课动作
     */
    public void lessonPrep() {
        System.out.println("Teacher - lessonPrep （老师备课）");
    }


}
