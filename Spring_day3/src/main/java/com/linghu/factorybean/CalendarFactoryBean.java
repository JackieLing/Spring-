package com.linghu.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

/*
* 用来创建复杂对象
* */
public class CalendarFactoryBean implements FactoryBean<Calendar> {//这里用到了泛型

    //用来书写复杂对象的创建方式
    @Override
    public Calendar getObject() throws Exception {
        return Calendar.getInstance();
    }

    //用来书写复杂对象的类型
    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    //用来指定对象的创建模式 true单例  false是多例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
