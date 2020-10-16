package com.ssm.service.impl;

import com.ssm.bean.User;
import com.ssm.dao.UserDao;
import com.ssm.service.UserService;
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
    public void saveOne(User user) {
        userDao.saveOne(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
