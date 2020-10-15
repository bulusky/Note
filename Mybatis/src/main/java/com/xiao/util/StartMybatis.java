package com.xiao.util;

import com.xiao.bean.Family;
import com.xiao.bean.User;
import com.xiao.dao.FamilyDao;
import com.xiao.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * mybatis启动类
 */
public class StartMybatis {
    private InputStream in;
    private SqlSession sqlSession;


    /**
     * 得到一个dao对象
     * @param type 需要得到对象对应的dao文件的class对象
     * @param <T>  传入的类型
     * @return dao对象
     */
    public  <T> T getOneDao(Class<T> type) throws IOException {
        String resource = "mybatisConfig.xml";
        in = Resources.getResourceAsStream(resource);
        //创建sqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //使用工厂创建对象sqlSession
        sqlSession = factory.openSession();
        //传入需要得到对象的dao文件class对象
        return sqlSession.getMapper(type);
    }

    /**
     * 释放资源
     */
    public void close(){
        //释放资源
        sqlSession.close();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
