package com.nr.spring.service.impl;

import com.nr.spring.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
@Service
public class UserServiceImpl implements UserService {

    public void test() {
        System.out.println("大好时光，别学java");
    }

    @PostConstruct
    public void init() {
        System.out.println("......init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("......destroy");
    }
}
