package com.nr.spring.service.impl;

import com.nr.spring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public void test() {
        System.out.println("大好时光，别学java");
    }
}
