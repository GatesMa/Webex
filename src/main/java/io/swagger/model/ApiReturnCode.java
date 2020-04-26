package io.swagger.model;

/**
 * Copyright (C), 2020
 * FileName: ApiReturnCode
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/4/25 13:03
 * Description:
 */
public enum ApiReturnCode {

    // 成功
    SUCCESS(200),

    // 用户名或密码不正确
    LOGIN_FAIL_FOR_ERROR(201),

    //文件为空
    FILE_EMPTY(303),

    // 失败
    FAIL(400),

    // 未认证（签名错误）
    UNAUTHORIZED(401),

    // 接口不存在
    NOT_FOUND(404),

    // 服务器内部错误
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ApiReturnCode(int code) {
        this.code = code;
    }

}
