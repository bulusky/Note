package com.xiao.service;

import com.xiao.bean.User;
import com.xiao.dao.UserDao;
import com.xiao.util.StartMybatis;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * 注解功能演示
 */
public class UserService {

    //对象
    UserDao userDao;

    /**
     * 获取对象
     */
    {
        try {
            userDao = new StartMybatis().getOneDao(UserDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询所有方法
     */
    @Test
    public void getAll(){
        List<User> list = userDao.getAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    public void getById(){
        User user = userDao.getById(1);
        System.out.println(user);
    }
}
