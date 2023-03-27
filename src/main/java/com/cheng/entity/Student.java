package com.cheng.entity;

/**
 * <h3>springboot-study</h3>
 *
 * @author cheng
 * @description <p>测试类</p>
 * @date 2023-03-27 13:16
 */
public class Student {

    private int sid;

    private String name;

    private String sex;

    public Student(int sid, String name, String sex) {
        this.sid = sid;
        this.name = name;
        this.sex = sex;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
