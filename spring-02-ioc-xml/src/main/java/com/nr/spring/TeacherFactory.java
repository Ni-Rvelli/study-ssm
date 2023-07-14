package com.nr.spring;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
public class TeacherFactory implements FactoryBean<Teacher> {

    //代替原始实例工厂创建对象的方法
    @Override
    public Teacher getObject() throws Exception {
        return new Teacher();
    }

    @Override
    public Class<?> getObjectType() {
        return Teacher.class;
    }

    // 是否是单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
