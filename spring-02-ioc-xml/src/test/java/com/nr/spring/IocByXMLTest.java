package com.nr.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
public class IocByXMLTest {


    @Test
    public void testIoc() {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student = (Student) ioc.getBean("student");
//        Student student = ioc.getBean(Student.class);
        Person Person = ioc.getBean(Person.class);
        System.out.println(Person);
    }

    @Test
    public void testDi(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentOne",Student.class);
        System.out.println(student);
    }


    @Test
    public void testDi2(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentThree",Student.class);
        System.out.println(student);
    }

    @Test
    public void testDi3() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("student11", Student.class);
        System.out.println(student);
    }

    @Test
    public void testScope() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        Student student1 = ioc.getBean("student", Student.class);
        System.out.println(student1);
        Student student2 = ioc.getBean("student", Student.class);
        System.out.println(student2);
        System.out.println(student1==student2);
    }

    @Test
    public void testAuto() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-auto.xml");
        Student student1 = ioc.getBean("student", Student.class);
        System.out.println(student1);

    }
}
