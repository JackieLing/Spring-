package com.linghu.test;

import com.linghu.dao.UserDao;
import com.linghu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("spring.xml");
        /*UserDao userDaoImpl = (UserDao) Context.getBean("userDaoImpl");
        userDaoImpl.save("令狐");*/
        UserService userServiceImpl = (UserService) Context.getBean("userServiceImpl");
        userServiceImpl.save("令狐荣豪");
    }
}
