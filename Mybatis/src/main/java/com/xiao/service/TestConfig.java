package com.xiao.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置文件详解测试
 */
public class TestConfig {

    /**
     *
     * @throws IOException
     */
    @Test
    public void testDefault() throws IOException {
        String resource = "mybatisConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //添加元素
        Properties properties = new Properties();
        properties.setProperty("password","root");
        //创建sqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in,properties);
        //使用工厂创建对象sqlSession
        factory.openSession();
        System.out.println(properties.getProperty("username"));
    }
}
