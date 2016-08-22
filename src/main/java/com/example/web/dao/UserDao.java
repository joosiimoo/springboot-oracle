package com.example.web.dao;

import com.example.web.domain.User;

import java.util.List;

public interface UserDao {

    List<User> selectAll();

}
