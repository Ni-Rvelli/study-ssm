package com.nr.spring;

import com.nr.spring.config.SpringConfig;
import com.nr.spring.controller.UserController;
import com.nr.spring.mapper.UserMapper;
import com.nr.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
public class AnnotationTest {


    @Test
    public void test01() {
        // 不能再通过ClassPathXmlApplicationContext获取IOC容器了，需要通过AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean(UserController.class);
        System.out.println(userController);
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService1 = context.getBean(UserService.class);
        UserService userService2 = context.getBean(UserService.class);
        System.out.println(userService1);
        System.out.println(userService2);
        context.close();
    }


    @Test
    public void test03() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService1 = context.getBean(UserService.class);
        System.out.println(userService1);
        context.close();
    }
}
