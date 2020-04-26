package com.gatesma.webex.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright (C), 2020
 * FileName: Contact
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/4/25 15:36
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    private String name;

    private String content;
}
