package com.linghu.dao;

import org.springframework.stereotype.Component;

@Component("userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void save(String name) {
        System.out.println("UserDao"+name);
    }
}
