package com.unit.tests.service;


import javax.annotation.Resource;

import com.unit.tests.dao.UserDao;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public String getUser() {
        return userDao.getUser();
    }
}