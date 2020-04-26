package com.gatesma.webex.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright (C), 2020
 * FileName: Profile
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/4/25 14:31
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    private String name;

    private String bornTime;

    private String email;

    private String phone;

    private String freelance;

}
