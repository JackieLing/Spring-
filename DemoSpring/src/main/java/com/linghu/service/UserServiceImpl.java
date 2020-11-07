package com.linghu.service;

import com.linghu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void save(String name) {
        userDao.save("你好");
        System.out.println("UserService:"+name);
    }
}
