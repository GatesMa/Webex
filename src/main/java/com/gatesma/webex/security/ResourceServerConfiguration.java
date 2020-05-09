package com.gatesma.webex.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

/**
 * Copyright (C), 2020
 * FileName: ResourceServerConfiguration
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/5/9 20:40
 * Description:
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    private static final String RESOURCE_ID = "password";

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId(RESOURCE_ID).stateless(false);
    }

    // 配置 URL 访问权限
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/account/**").hasRole("account")
            .antMatchers("/page/**").hasRole("page")
            .antMatchers("/personal/**").hasRole("personal")
            .antMatchers("/resource/**").hasRole("resource")
            .antMatchers("/other/**").hasRole("other")
            .anyRequest().authenticated();
    }
}