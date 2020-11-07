package com.linghu.test;

import com.linghu.dao.UserDao;
import com.linghu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("spring.xml");
        /*
        * 因为我们用了Component注解，它会自动为我们创建一个对象，对象id为类名的首字母小写
        * UserDaoImpl===userDaoImpl
        *
        * aa是通过注解注入生成的id，bean对象拿到id之后进行业务调用
        * */
        UserDao userDao = (UserDao) Context.getBean("aa");
        UserService userService = (UserService) Context.getBean("userService");
/*
        userDao.save("令狐");
*/
        userService.save("荣豪");
    }
}
