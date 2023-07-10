package com.nr.spring;

import com.nr.spring.controller.UserController;
import com.nr.spring.mapper.UserMapper;
import com.nr.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
public class AnnotationTest {


    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = context.getBean(UserController.class);
        System.out.println(userController);
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService);
        UserMapper userMapper = context.getBean(UserMapper.class);
        System.out.println(userMapper);
        context.registerShutdownHook();
    }


    @Test
    public void test02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserController userController = context.getBean(UserController.class);
        userController.test();
    }
}
