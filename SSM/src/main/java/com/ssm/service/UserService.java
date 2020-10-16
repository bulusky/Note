package com.ssm.service;

import com.ssm.bean.User;

import java.util.List;

public interface UserService {
    void saveOne(User user);

    List<User> getAll();
}
