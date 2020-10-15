package com.xiao.dao;

import com.xiao.bean.Family;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FamilyDao {

    Family getById(Integer id);

    List<Family> getAll();
}
