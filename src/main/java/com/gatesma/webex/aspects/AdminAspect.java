package com.gatesma.webex.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2020
 * FileName: AdminAspect
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/19 10:19
 * Description: Admin的切面类
 */
@Aspect
@Component
public class AdminAspect {

    @Pointcut("execution(* com.gatesma.webex.entities.Admin.Login(..))")
    public void pointCut() {};

    @Before("pointCut()")
    public void logStart() {
        System.out.println("Admin - AOP - 管理员 - Login - Before");
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("Admin - AOP - 管理员 - Login - After");
    }

}
