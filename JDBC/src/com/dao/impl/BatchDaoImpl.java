package com.dao.impl;

import com.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Auther:PEX
 * @Date:2020/7/17-20:18
 * @Description: com.dao.impl
 * @version:1.8
 *
 * sql语句批处理
 * 注意：sql注入
 * 加入prepareStatement
 * 具体见EmpDaoImpl2。java
 */
public class BatchDaoImpl {
    public static void main(String[] args){
        Long state = System.currentTimeMillis();
        insertBatch();
        System.out.println(System.currentTimeMillis()-state);
    }
    public static void insertBatch(){
        Connection connection = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        String sql = "insert into emp(empno,ename) values(?,?)";

        try {
            pstmt = connection.prepareStatement(sql);
            for (int i = 0; i <10 ; i++) {
                pstmt.setInt(1,i);
                pstmt.setString(2,"pex"+i);
                //向批处理中添加sql语句
                pstmt.addBatch();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
