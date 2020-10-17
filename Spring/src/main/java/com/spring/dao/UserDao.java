package com.spring.dao;


import com.spring.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    /**
     * 模拟保存
     */
    public void save(User user);

    List<User> getAll();
}
