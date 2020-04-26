package com.gatesma.webex.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2020
 * FileName: StudentAspect
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/19 10:42
 * Description: 学生切面类
 */
@Aspect
@Component
public class StudentAspect {

    @Pointcut("execution(* com.gatesma.webex.entities.Student.study(..))")
    public void pointCut() {};

    @Before("pointCut()")
    public void logStart() {
        System.out.println("Student - AOP - 学生 - Study - Before");
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("Student - AOP - 学生 - Study - After");
    }
}
