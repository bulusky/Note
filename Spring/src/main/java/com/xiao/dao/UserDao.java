package com.xiao.dao;


import com.xiao.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    /**
     * 模拟保存
     */
    public void save(User user);
}
