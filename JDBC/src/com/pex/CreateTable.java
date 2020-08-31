package com.pex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Auther:PEX
 * @Date:2020/7/16-17:27
 * @Description: com.pex
 * @version:1.8
 */
public class CreateTable {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
        Statement statement = connection.createStatement();
        String sql = "create table psn(id number(10) primary key,name varchar2(10))";
        boolean execute = statement.execute(sql);
        System.out.println(execute);
        statement.close();
        connection.close();
    }
}
