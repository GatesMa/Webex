package com.gatesma.webex.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright (C), 2020
 * FileName: Project
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/4/25 15:09
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    private String name;

    private String time;

    private String content;
}
