package com.catalina.service;

import com.catalina.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save(User user);

    User getByID(int id);

    void update(User user);

    void delete(int id);
}
