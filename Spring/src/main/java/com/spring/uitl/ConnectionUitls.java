package com.spring.uitl;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUitls {

    //创建一个连接池
    private ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
    //用于注入DataSource对象
    private DataSource dataSource;

    //构造函数
    public ConnectionUitls(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //获取一个连接
    public void getThreadConnection(){
        try {
            Connection connection = threadLocal.get();
            if (connection==null){
                threadLocal.set(dataSource.getConnection());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //解绑线程
    public void removeConnection() {
        threadLocal.remove();
    }
}
