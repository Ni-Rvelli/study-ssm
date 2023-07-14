package com.nr.spring.controller;

import com.nr.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    public void test() {
        userService.test();
    }
}
