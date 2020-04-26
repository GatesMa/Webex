package com.gatesma.webex.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2020
 * FileName: TeacherAspect
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/19 10:43
 * Description: 老师切面类
 */
@Aspect
@Component
public class TeacherAspect {

    @Pointcut("execution(* com.gatesma.webex.entities.Teacher.lessonPrep(..))")
    public void pointCut() {};

    @Before("pointCut()")
    public void logStart() {
        System.out.println("Teacher - AOP - 老师 - lessonPrep - Before");
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("Teacher - AOP - 老师 - lessonPrep - After");
    }

}
