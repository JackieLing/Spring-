package com.linghu.service;


import com.linghu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService {

    /*@Autowired注解相当于自动注入，赋值的意思*/
    @Autowired
    private UserDao userDao;
    /*加入注解之后，可以不用提供set方法了*/
    @Override
    public void save(String name) {
        userDao.save(name);
        System.out.println("Service:"+name);
    }
}
