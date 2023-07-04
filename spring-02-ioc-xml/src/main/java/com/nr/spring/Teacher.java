package com.nr.spring;

/**
 * @Description:
 * @Author: nirui
 * @Date: 2020-05-27
 */
public class Teacher implements Person{
    /**
     * id
     */
    private String id;
    /**
     * 名字
     */
    private String name;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
