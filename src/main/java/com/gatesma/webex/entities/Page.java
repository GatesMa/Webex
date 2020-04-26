package com.gatesma.webex.entities;

/**
 * Copyright (C), 2020
 * FileName: Page
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/4/25 13:31
 * Description: 主页相关信息
 */
public class Page {

    /**
     * 主页名称
     */
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Page{" +
                "name='" + name + '\'' +
                '}';
    }
}
