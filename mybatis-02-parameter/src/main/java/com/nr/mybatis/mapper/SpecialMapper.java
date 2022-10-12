package com.nr.mybatis.mapper;

import com.nr.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Date: 2022/10/12
 * @Author: NiRui
 * @Description:
 */
public interface SpecialMapper {

    /**
     * 通过名字模糊查询
     * @param nameLike
     * @return
     */
    List<User> getUserByNameLike(@Param("nameLike") String nameLike);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteMore(@Param("ids") String ids);

    /**
     * 动态设置表名
     * @param tableName
     * @return
     */
    List<User> getAllUser(@Param("tableName") String tableName);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int insertUser(User user);
}
