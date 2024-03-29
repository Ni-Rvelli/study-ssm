package com.nr.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
@Configuration
@ComponentScan("com.nr")
@Import(JdbcConfig.class)
public class SpringConfig {
}
