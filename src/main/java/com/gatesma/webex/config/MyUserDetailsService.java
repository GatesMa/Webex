package com.gatesma.webex.config;

import com.gatesma.webex.entities.Account;
import com.gatesma.webex.util.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.management.relation.Role;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Copyright (C), 2020
 * FileName: MyUserDetailsService
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/5/10 12:11
 * Description:
 */
public class MyUserDetailsService implements UserDetailsService {

    /**
     * 根据用户名获取登录用户信息
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account =(Account) SpringUtil.getBean("account");

        if(account == null){
            throw new UsernameNotFoundException("用户名："+ username + "不存在！");
        }
        Collection<SimpleGrantedAuthority> collection = new HashSet<SimpleGrantedAuthority>();

        collection.add(new SimpleGrantedAuthority("account"));
        collection.add(new SimpleGrantedAuthority("page"));
        collection.add(new SimpleGrantedAuthority("personal"));
        collection.add(new SimpleGrantedAuthority("resource"));
        collection.add(new SimpleGrantedAuthority("other"));

        return new org.springframework.security.core.userdetails.User(account.getLoginName(),account.getPassword(),collection);
    }
}
