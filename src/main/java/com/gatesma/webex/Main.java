package com.gatesma.webex;

import com.gatesma.webex.entities.Admin;
import com.gatesma.webex.entities.Student;
import com.gatesma.webex.entities.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C), 2020
 * FileName: Aop7IocMain
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/19 08:58
 * Description:
 */
public class Main {



    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = 
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        /**
         *   1. 利用setter属性值注入   ------>   请查看applicationContext.xml配置文件
         */
        Admin admin = (Admin) applicationContext.getBean("admin");
        System.out.println("1. setter属性值注入：" + admin);
        /**
         *   2. 利用构造器属性值注入    ------>   请查看applicationContext.xml配置文件
         */
        Student student = (Student) applicationContext.getBean("student");
        System.out.println("2. 构造器属性值注入：" + student);
        /**
         *   3. 利用注解注入           ------>   请查看 entities/Teacher.java 文件，使用了注解完成实体类配置
         */
        Teacher teacher = (Teacher) applicationContext.getBean("teacher");
        System.out.println("3. 注解注入：" + teacher);
        /**
         *   4. AOP配置：
         *      我为 管理员、学生、老师 这三个类都配置了切面，切面类在aspects包下
         *      下面的代码是测试代码。调用对象的方法，会触发 (前置通知) 和 (后置通知)
         */
        System.out.println("4. AOP测试：");
        System.out.println("==========================  Admin AOP  ==========================");
        admin.Login();
        System.out.println("========================== Student AOP ==========================");
        student.study();
        System.out.println("========================== Teacher AOP ==========================");
        teacher.lessonPrep();
    }

}
