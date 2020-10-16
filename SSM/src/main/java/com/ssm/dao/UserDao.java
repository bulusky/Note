package com.ssm.dao;

import com.ssm.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 注解形式
 */
@Repository
public interface UserDao {

    @Select("select * from user")
    List<User> getAll();

    @Select("select * from user where id = #{id}")
    User getById(Integer id);

    @Insert("insert into user (name) values (user.name)")
    void saveOne(User user);
}
