package com.gatesma.webex;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.api.AccountApi;
import io.swagger.api.AccountApiController;
import io.swagger.api.PageApiController;
import javafx.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Copyright (C), 2020
 * FileName: AccountApiTest
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/4/25 18:59
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class AccountApiTest {


    private MockMvc mockMvc;//定义一个 MockMvc

    @Autowired
    private AccountApiController accountApiController;

    /**
     * 初始化 MockMvc 通过MockMvcBuilders.standaloneSetup 模拟一个 UserController 测试环境，通过build得到一个MockMvc
     * */
    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(accountApiController).build();
    }

    @Test
    public void login() throws Exception{
        MvcResult mvcResult = mockMvc.perform( // 执行一个RequestBuilder请求
                MockMvcRequestBuilders // 有几个静态方法，用以发起不同类型的请求
                        .post("/account/login")
                        .accept(MediaType.APPLICATION_JSON) // accept 类型
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "  \"password\": \"123456\",\n" +
                                "  \"username\": \"gatesma\"\n" +
                                "}"))
                .andDo(print()) // 打印请求信息，如请求头，请求路径，请求数据等 添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断
                .andExpect(status().isOk()) //添加断言
                .andReturn(); // Mock返回结果
        System.out.println(mvcResult);
    }




}
