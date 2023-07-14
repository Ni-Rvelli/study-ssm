package com.nr.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
public class UserDao implements InitializingBean, DisposableBean {

    public UserDao(){
        System.out.println("...........structure");
    }


    @Override
    public void destroy(){
        System.out.println("...........destroy");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("...........init");
    }
}
