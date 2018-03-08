package com.catalina.dao;

import com.catalina.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    User getByID(int id);

    List<User> findAll();

    void update(User user);

    void delete(int id);
}
