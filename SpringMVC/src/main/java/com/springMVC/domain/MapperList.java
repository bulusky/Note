package com.springMVC.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class MapperList implements Serializable {
    private Integer id;


    private List<User> userList;
    private Map<String, User> userMap;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public String toString() {
        return "MapperList{" +
                "id=" + id +
                ", userList=" + userList +
                ", userMap=" + userMap +
                '}';
    }
}
