package com.nr.mybatis.pojo;

import java.util.List;

/**
 * @Date: 2022/10/22
 * @Author: NiRui
 * @Description:部门对象
 */
public class Dept {
    /**
     * id
     */
    private Integer deptId;
    /**
     * 名称
     */
    private String deptName;
    /**
     * 员工集合
     */
    List<Emp> empList;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", empList=" + empList +
                '}';
    }
}
