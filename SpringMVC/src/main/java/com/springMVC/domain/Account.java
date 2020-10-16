package com.springMVC.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer id;
    //引用类
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", user=" + user +
                '}';
    }
}
