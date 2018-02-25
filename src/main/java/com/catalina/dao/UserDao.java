package com.catalina.dao;

import com.catalina.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
}
