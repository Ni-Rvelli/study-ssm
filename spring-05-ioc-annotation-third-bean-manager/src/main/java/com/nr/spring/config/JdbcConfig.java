package com.nr.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
@Configuration
public class JdbcConfig {

    @Value("com.mysql.jdbc.Driver")
    private String DriverClassName;

    @Value("jdbc:mysql://localhost:3306/test")
    private String url;

    @Value("root")
    private String name;

    @Value("123456")
    private String Password;

    //1、定义一个方法获取要管理的对象
    //2、添加@Bean,表示当前方法的返回值是一个bean
    @Bean
    public DataSource dataSource(UserMapper userMapper) {
        System.out.println(userMapper);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(DriverClassName);
        ds.setUrl(url);
        ds.setUsername(name);
        ds.setPassword(Password);
        return ds;
    }

}
