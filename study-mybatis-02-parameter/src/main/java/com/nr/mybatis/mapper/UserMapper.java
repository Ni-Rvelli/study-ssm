package com.nr.mybatis.mapper;

import com.nr.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @Date: 2022/9/27
 * @Author: NiRui
 * @Description: 用户信息接口类
 */
public interface UserMapper {

    /**
     * 通过名称获取用户名
     *
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 校验登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username,String password);

    /**
     * 校验登录
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String,Object> map);

    /**
     * 添加用户
     *
     * @param user
     */
    void insertUser(User user);

    /**
     * 校验登录
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username, @Param("password")String password);
}
