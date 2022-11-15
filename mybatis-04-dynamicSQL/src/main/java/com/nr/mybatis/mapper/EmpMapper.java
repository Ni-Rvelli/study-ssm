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
     * 根据条件查询员工对象集合
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 选择条件查询
     * @param emp
     * @return
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 批量添加员工
     * @param emps
     */
    void batchInsertEmp(@Param("emps") List<Emp> emps);

    /**
     * 批量删除员工
     * @param ids
     */
    void batchDeleteEmp(@Param("ids")List<Integer> ids);
}
