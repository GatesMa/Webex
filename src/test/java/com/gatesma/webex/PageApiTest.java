package com.gatesma.webex;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.api.PageApiController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
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
 * FileName: PageApiTest
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/4/25 19:39
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@WebAppConfiguration
public class PageApiTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;//定义一个 MockMvc

    @Autowired
    private PageApiController pageApiController;

    /**
     * 初始化 MockMvc 通过MockMvcBuilders.standaloneSetup 模拟一个 UserController 测试环境，通过build得到一个MockMvc
     * */
    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(pageApiController).build();
    }

    @Test
    public void getName() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                .get("/page/get_name")
                .accept(MediaType.APPLICATION_JSON) // accept 类型
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print()) // 打印请求信息，如请求头，请求路径，请求数据等 添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断
                .andExpect(MockMvcResultMatchers.status().isOk()) //添加断言
                .andReturn(); // Mock返回结果
        System.out.println(mvcResult);
    }

    @Test
    public void setName() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                .post("/page/set_name")
                .accept(MediaType.APPLICATION_JSON) // accept 类型
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\t\"name\":\"Marlon Page\"\n" +
                        "}")
        )
                .andDo(print()) // 打印请求信息，如请求头，请求路径，请求数据等 添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断
                .andExpect(MockMvcResultMatchers.status().isOk()) //添加断言
                .andReturn(); // Mock返回结果
        System.out.println(mvcResult);
    }

}
