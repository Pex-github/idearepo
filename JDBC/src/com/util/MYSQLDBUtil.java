package com.util;
import java.sql.*;

/**
 * @Auther:PEX
 * @Date:2020/7/16-18:25
 * @Description: com.util
 * @version:1.8
 */
public class MYSQLDBUtil {
    public static final String URL="jdbc:mysql://localhost:3306/demo";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "123456";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

     public static void closeConnection(Connection connection){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
     }
     public static void closeConnection(Connection connection,Statement statement){
         if(statement!=null){
             try {
                 statement.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
         }
         if(connection!=null){
             try {
                 connection.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
         }
     }
    public static void closeConnection(Connection connection,Statement statement,ResultSet resultSet){
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



}
