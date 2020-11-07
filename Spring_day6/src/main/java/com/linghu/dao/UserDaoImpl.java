package com.linghu.dao;

import org.springframework.stereotype.Component;

/*@Component相当于自动创建了一个bean id【对象】*/
@Component("aa")
public class UserDaoImpl implements UserDao {
    @Override
    public String save(String name) {
        System.out.println("DAO"+name);
        return null;
    }
}
