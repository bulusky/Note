package com.spring.dao.Impl;


import com.spring.bean.User;
import com.spring.dao.UserDao;

import java.util.ArrayList;
import java.util.List;



public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {

    }

    /**
     * 模拟查询数据
     * @return 模拟数据
     */
    @Override
    public List<User> getAll() {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setId(6);
        user.setName("小桃子");
        userList.add(user);
        System.out.println("可爱小桃子");
        return userList;
    }
}
