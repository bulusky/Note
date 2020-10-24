package com.xiao.config;

import com.xiao.dao.UserDao;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.SQLException;

public class Myconfig {

    @Test
    public void test() throws SQLException {
        //
        DataSource dataSource = new PooledDataSource("com.mysql.jdbc.Driver","jdbc:mysql:///test","root","root");
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(UserDao.class);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(configuration);
        SqlSession sqlSession = factory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.getAll();
    }

    public void t(){

    }
}
