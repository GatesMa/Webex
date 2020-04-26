package com.gatesma.webex.util;

import com.gatesma.webex.entities.Contact;
import com.gatesma.webex.entities.Project;
import com.gatesma.webex.entities.Score;
import io.swagger.model.ContactItem;

/**
 * Copyright (C), 2020
 * FileName: EntityUtil
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/4/25 15:16
 * Description:
 */
public class EntityUtil {

    public static Project swaggerProToModelPro(io.swagger.model.Project project) {
        return new Project(project.getName(), project.getTime(), project.getContent());
    }

    public static Score swaggerScoreToModel(io.swagger.model.Score score){
        return new Score(score.getName(), score.getScore().toString());
    }

    public static Contact swaggerContactToModel(ContactItem contactItem){
        return new Contact(contactItem.getName(), contactItem.getContent());
    }

}
