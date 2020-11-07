package com.linghu.test;

import com.linghu.factorybean.SqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {



      /*  //抽象类是不能直接new的，我们只能通过它提供的方法进行实例化
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());*/

        /*Calendar calendar = (Calendar) Context.getBean("calendar");
        System.out.println(calendar.getTime());*/

            ApplicationContext Context = new ClassPathXmlApplicationContext("spring.xml");
            SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) Context.getBean("sqlSessionFactory");
            SqlSession sqlSession = sqlSessionFactory.openSession();
            System.out.println(sqlSession);


    }
}
