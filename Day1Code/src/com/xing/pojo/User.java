package com.xing.pojo;/*
 * @author Xingqilin
 *
 */


import lombok.experimental.Accessors;

@Accessors(chain = true)
public class User {
    private String uname;
    private String upwd;

    public User() {
    }

    public User(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                '}';
    }
}
