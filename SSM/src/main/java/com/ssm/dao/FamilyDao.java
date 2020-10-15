package com.ssm.dao;

import com.ssm.bean.Family;

import java.util.List;

public interface FamilyDao {

    Family getById(Integer id);

    List<Family> getAll();
}
