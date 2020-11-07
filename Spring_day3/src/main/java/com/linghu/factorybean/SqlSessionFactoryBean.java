package com.linghu.factorybean;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

import java.io.InputStream;

//自定义创建复杂对象SqlSessionFactory
public class SqlSessionFactoryBean implements FactoryBean<SqlSessionFactory> {
    private String configLocation;

    public void setConfigLocation(String configLocation) {
        this.configLocation = configLocation;
    }

    @Override
    public SqlSessionFactory getObject() throws Exception {
        InputStream is = Resources.getResourceAsStream(configLocation);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        return build;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
