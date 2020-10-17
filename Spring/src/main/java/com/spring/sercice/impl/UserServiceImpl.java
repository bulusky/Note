package com.spring.sercice.impl;

import com.spring.bean.User;
import com.spring.dao.UserDao;
import com.spring.sercice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> getAll() {
        userDao.getAll();
        int a =5/0;
        return userDao.getAll();

    }
}
