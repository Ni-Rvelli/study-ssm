package com.nr.spring;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
public class StudentFactory {

    public static Student getStudent(){
        return new Student();
    }
}
