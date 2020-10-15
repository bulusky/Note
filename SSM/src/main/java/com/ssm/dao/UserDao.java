package com.ssm.dao;

import com.ssm.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 注解形式
 */
public interface UserDao {

    @Select("select * from user")
    List<User> getAll();

    @Select("select * from user where id = #{id}")
    User getById(Integer id);
}
