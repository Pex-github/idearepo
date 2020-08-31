package com.pex.dao.impl;

import com.pex.dao.UserDao;
import com.pex.entity.User;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.sql.*;

/**
 * @Auther:PEX
 * @Date:2020/8/27-12:35
 * @Description: com.pex.dao.impl
 * @version:1.8
 */
public class UserDaoImpl implements UserDao {
    @Override
    public User checkUser(User user) {

        Connection conn =null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        User u = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","123456");
            pstmt = conn.prepareStatement("select * from user where name = ? and pwd =?");
            pstmt.setString(1,user.getName());
            pstmt.setString(2,user.getPwd());
            rs = pstmt.executeQuery();

            while (rs.next()){
                u = new User(rs.getInt("id"),rs.getString("name"),rs.getString("pwd"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return u;
    }
}
