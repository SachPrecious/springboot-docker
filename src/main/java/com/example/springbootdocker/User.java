package com.example.springbootdocker;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    private Integer user_id;

    public User(Integer user_id, String user_name, String mobile_no) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.mobile_no = mobile_no;
    }

    private String user_name;
    private String mobile_no;

    public User() {

    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }
}
