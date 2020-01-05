package com.example.entity;

import java.util.Date;

public class Account {
    private String userId;
    private String userName;
    private String password;


    public String getUserName() {
        return userName;
    }



    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
