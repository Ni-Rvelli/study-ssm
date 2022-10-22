package com.nr.mybatis.mapper;

import com.nr.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @Date: 2022/10/22
 * @Author: NiRui
 * @Description:
 */
public interface DeptMapper {

    Dept getDeptByStep(@Param("deptId") Integer deptId);


    Dept getDepAndEmpById(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpByStep(@Param("deptId") Integer deptId);
}
