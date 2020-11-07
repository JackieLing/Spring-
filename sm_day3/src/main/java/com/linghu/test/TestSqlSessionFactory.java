package com.linghu.test;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSqlSessionFactory {
    public static void main(String[] args) {
       ApplicationContext Context = new ClassPathXmlApplicationContext("spring.xml");
       SqlSessionFactoryBean sqlSessionFactory = (SqlSessionFactoryBean) Context.getBean("sqlSessionFactory");

    }
}
