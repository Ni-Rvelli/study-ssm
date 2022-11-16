package com.nr.mybatis.pojo;

/**
 * @Date: 2022/10/22
 * @Author: NiRui
 * @Description: 员工对象
 */
public class Emp {

    /**
     * id
     */
    private Integer empId;

    /**
     * 名称
     */
    private String empName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String gender;
    /**
     * 部门id
     */
    private String deptId;


    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", deptId='" + deptId + '\'' +
                '}';
    }
}
