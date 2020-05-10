package com.gatesma.webex;

import com.gatesma.webex.entities.Page;
import com.gatesma.webex.entities.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages = { "com.gatesma.webex","io.swagger","com.gatesma.webex.security"})
@ImportResource({"classpath:applicationContext.xml", "classpath:data.xml"})
public class WebexApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebexApplication.class, args);
    }

}
