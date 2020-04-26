package com.gatesma.webex;

import io.swagger.api.PageApiController;
import io.swagger.api.PersonalApiController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Copyright (C), 2020
 * FileName: PersonalApiTest
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/4/25 20:25
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@WebAppConfiguration
public class PersonalApiTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;//定义一个 MockMvc

    @Autowired
    private PersonalApiController personalApiController;

    /**
     * 初始化 MockMvc 通过MockMvcBuilders.standaloneSetup 模拟一个 UserController 测试环境，通过build得到一个MockMvc
     * */
    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(personalApiController).build();
    }

    @Test
    public void getProfile() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                .get("/personal/get_basicProfile")
                .accept(MediaType.APPLICATION_JSON) // accept 类型
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print()) // 打印请求信息，如请求头，请求路径，请求数据等 添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断
                .andExpect(MockMvcResultMatchers.status().isOk()) //添加断言
                .andReturn(); // Mock返回结果
        System.out.println(mvcResult);
    }

    @Test
    public void setProfile() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                .post("/personal/set_basicProfile")
                .accept(MediaType.APPLICATION_JSON) // accept 类型
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "  \"born_time\": \"string\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"freelance\": \"string\",\n" +
                        "  \"name\": \"string\",\n" +
                        "  \"phone\": \"string\"\n" +
                        "}")

        )
                .andDo(print()) // 打印请求信息，如请求头，请求路径，请求数据等 添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断
                .andExpect(MockMvcResultMatchers.status().isOk()) //添加断言
                .andReturn(); // Mock返回结果
        System.out.println(mvcResult);
    }

    @Test
    public void getProject() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                .get("/personal/get_projectlist")
                .accept(MediaType.APPLICATION_JSON) // accept 类型
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print()) // 打印请求信息，如请求头，请求路径，请求数据等 添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断
                .andExpect(MockMvcResultMatchers.status().isOk()) //添加断言
                .andReturn(); // Mock返回结果
        System.out.println(mvcResult);
    }

    @Test
    public void setProject() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                .post("/personal/set_projectlist")
                .accept(MediaType.APPLICATION_JSON) // accept 类型
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "  \"list\": [\n" +
                        "    {\n" +
                        "      \"content\": \"string\",\n" +
                        "      \"name\": \"string\",\n" +
                        "      \"time\": \"string\"\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}")

        )
                .andDo(print()) // 打印请求信息，如请求头，请求路径，请求数据等 添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断
                .andExpect(MockMvcResultMatchers.status().isOk()) //添加断言
                .andReturn(); // Mock返回结果
        System.out.println(mvcResult);
    }

    @Test
    public void getScore() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                .get("/personal/get_scorelist")
                .accept(MediaType.APPLICATION_JSON) // accept 类型
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print()) // 打印请求信息，如请求头，请求路径，请求数据等 添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断
                .andExpect(MockMvcResultMatchers.status().isOk()) //添加断言
                .andReturn(); // Mock返回结果
        System.out.println(mvcResult);
    }

    @Test
    public void setScore() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                .post("/personal/set_scorelist")
                .accept(MediaType.APPLICATION_JSON) // accept 类型
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "  \"list\": [\n" +
                        "    {\n" +
                        "      \"name\": \"string\",\n" +
                        "      \"score\": 90\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}")

        )
                .andDo(print()) // 打印请求信息，如请求头，请求路径，请求数据等 添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断
                .andExpect(MockMvcResultMatchers.status().isOk()) //添加断言
                .andReturn(); // Mock返回结果
        System.out.println(mvcResult);
    }
}
