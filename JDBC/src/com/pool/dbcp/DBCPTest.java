package com.pool.dbcp;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * @Auther:PEX
 * @Date:2020/7/21-19:48
 * @Description: com.pool.dbcp
 * @version:1.8
 */
public class DBCPTest {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    }
}
