package com.nr.mybatis.mapper;

import com.nr.mybatis.pojo.User;

import java.util.List;

/**
 * @Date: 2022/9/27
 * @Author: NiRui
 * @Description: 用户信息接口类
 */
public interface UserMapper {

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     * @return
     */
    int updateUser();

    /**
     * 删除用户信息
     * @return
     */
    int deleteUser();

    /**
     * 根据id查询用户信息
     * @return
     */
    User getUserById();

    /**
     * 查询所有的用户
     * @return
     */
    List<User> getAllUser();
}
