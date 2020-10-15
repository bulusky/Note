package com.xiao.dao.Impl;


import com.xiao.bean.User;
import com.xiao.dao.UserDao;

/**
 * 模拟保存操作
 */

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("dao对象创建了");
    }

    public void init() {
        System.out.println("dao对象初始化了");
    }

    public void destroy() {
        System.out.println("dao对象销毁了");
    }

    public void save() {
        System.out.println("dao保存");
    }

    @Override
    public void save(User user) {
        System.out.println("保存成功！");
    }
}
