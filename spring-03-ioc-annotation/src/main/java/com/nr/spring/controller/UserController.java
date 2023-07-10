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
    @Qualifier("userServiceImpl")
    private UserService userService;

//    // 方法二、标记在构造器上
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    // 方法三、标记在set方法上
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    public void test() {
        userService.test();
    }
}
