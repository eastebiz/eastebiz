package com.eastebiz.dao;

import com.eastebiz.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> selectAllUser();
}
