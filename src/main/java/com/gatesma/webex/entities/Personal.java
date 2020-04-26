package com.gatesma.webex.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Copyright (C), 2020
 * FileName: Personal
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/4/25 14:29
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personal {

    private Profile profile;

    private List<Project> projectList;

    private List<Score> scoreList;

}
