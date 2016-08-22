package com.example.web.service.impl;

import com.example.web.dao.UserDao;
import com.example.web.domain.User;
import com.example.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
