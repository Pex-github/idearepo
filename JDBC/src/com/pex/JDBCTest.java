package com.pex;

import java.sql.*;
import java.time.temporal.ValueRange;

/**
 * @Auther:PEX
 * @Date:2020/7/14-17:25
 * @Description: com.pex
 * @version:1.8
 */
public class JDBCTest {
    public static void main(String[] args) throws Exception{
        //加载驱动程序
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //建立连接
        //Connection connection = DriverManager.getConnection("jdbc:oracle:thin@localhost:1502:orcl", "scott", "tiger");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
        //测试是否连接成功
        System.out.println(connection);
        //定义sql语句
        String sql = "select * from emp";
        //准备静态处理快对象
        Statement statement = connection.createStatement();
        //执行sql语句，返回结果对象是结果集合
        ResultSet resultSet = statement.executeQuery(sql);
        //循环处理
        while(resultSet.next()){
            int anInt = resultSet.getInt(1);
            System.out.println(anInt);
            String ename = resultSet.getString("ename");
            System.out.println(ename);
            System.out.println("--------------------");
        }
        //关闭连接
        statement.close();
        connection.close();


    }
}
