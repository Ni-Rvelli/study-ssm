package com.nr.mybatis.mapper;

import com.nr.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Date: 2022/10/11
 * @Author: NiRui
 * @Description: 查询mapper
 */
public interface SelectMapper {

    /**
     * 根据用户id查询用户信息
     *
     * @param id
     * @return
     */
    User getUserById(@Param("id") int id);

    /**
     * 查询全部用户
     *
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询数量
     *
     * @return
     */
    int getCount();

    /**
     * 查询一条数据，返回map
     *
     * @param id
     * @return
     */
    Map<String, Object> getUserByIdToMap(@Param("id") int id);

    /**
     * 查询多条数据返回map
     *
     * @return
     */
    List<Map<String, Object>> getAllUserToMap();

    /**
     * 查询多条数据返回map
     * key为注解MapKey中指定的字段
     *
     * @return
     */
    @MapKey("id")
    Map<String, Object> getAllUserToMapKey();
}
