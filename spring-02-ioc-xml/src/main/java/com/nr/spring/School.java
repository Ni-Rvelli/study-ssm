package com.nr.spring;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
public class School {

    private String id;

    private String schoolName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    @Override
    public String toString() {
        return "School{" +
                "id='" + id + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
