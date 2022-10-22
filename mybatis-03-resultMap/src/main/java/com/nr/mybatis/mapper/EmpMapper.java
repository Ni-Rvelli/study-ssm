package com.nr.mybatis.mapper;

import com.nr.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Date: 2022/10/22
 * @Author: NiRui
 * @Description: 员工数据操作接口
 */
public interface EmpMapper {

    /**
     * 通过empId查询
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * 获取员工和部门
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    Emp getEmpAndDeptByStep(@Param("empId") Integer empId);

    List<Emp> getEmpByDeptId(@Param("deptId") Integer deptId);
}
