package com.dao.impl;

import com.dao.Emp;
import com.dao.Empintfce;
import com.util.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.text.SimpleDateFormat;

/**
 * @Auther:PEX
 * @Date:2020/7/16-18:19
 * @Description: com.dao.impl
 * @version:1.8
 */
public class EmpDaoImpl implements Empintfce {
    //插入操作
    @Override
    public void insert(Emp emp) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DBUtil.getConnection();
            statement = connection.createStatement();
            String sql = "insert into emp values(" + emp.getEmpno() + ",'" + emp.getEname() + "','" + emp.getJob() + "',"
                    + emp.getMrg() + ",to_date('" + emp.getHiredate()+"','YYYY-MM-DD')," + emp.getSal() + ","
                    + emp.getComm() + "," + emp.getDeptno() + ")";
            System.out.println(sql);
            int i = statement.executeUpdate(sql);
            System.out.println("受影响的行数是：" + i);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.closeConnection(connection,statement);
        }


    }
    //删除操作
    @Override
    public void delete(Emp emp) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DBUtil.getConnection();
            statement = connection.createStatement();
            String sql = "delete from emp where empno = " + emp.getEmpno();
            System.out.println(sql);
            int i = statement.executeUpdate(sql);
            System.out.println("受影响的行数是：" + i);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.closeConnection(connection,statement);
        }
    }

    @Override
    public void update(Emp emp) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
//            connection.setAutoCommit(true);
            statement = connection.createStatement();
            //拼接sql语句
            String sql = "update emp set job = '" + emp.getJob() + "' where empno = " + emp.getEmpno();
            System.out.println(sql);
            //返回值表示受影响的行数
            int i = statement.executeUpdate(sql);
            System.out.println("受影响的行数是：" + i);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(connection, statement);
        }
    }

    @Override
    public Emp getEmpByEmpno(Integer empno) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Emp emp = null;
        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
//            connection.setAutoCommit(true);
            statement = connection.createStatement();
            //拼接sql语句
            String sql = "select * from emp where empno = " + empno;
            System.out.println(sql);
            //返回值表示受影响的行数
            resultSet = statement.executeQuery(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            while (resultSet.next()) {
                emp = new Emp(resultSet.getInt("empno"), resultSet.getString("ename"), resultSet.getString("job"),
                        resultSet.getInt("mgr"), sdf.format(resultSet.getDate("hiredate")), resultSet.getDouble("sal"),
                        resultSet.getDouble("comm"), resultSet.getInt("deptno"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(connection, statement,resultSet);
        }
        return emp;
    }

    @Override
    public Emp getEmpByEname(String name) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Emp emp = null;
        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
//            connection.setAutoCommit(true);
            statement = connection.createStatement();
            //拼接sql语句
            String sql = "select * from emp where ename = " + name;
            System.out.println(sql);
            //返回值表示受影响的行数
            resultSet = statement.executeQuery(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            while (resultSet.next()) {
                emp = new Emp(resultSet.getInt("empno"), resultSet.getString("ename"), resultSet.getString("job"),
                        resultSet.getInt("mgr"), sdf.format(resultSet.getDate("hiredate")), resultSet.getDouble("sal"),
                        resultSet.getDouble("comm"), resultSet.getInt("deptno"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(connection, statement,resultSet);
        }
        return emp;
    }
    public static void main(String[] args){
        Empintfce empDao = new EmpDaoImpl();
        Emp emp = new Emp(3333,"sisi","SALES",1111,"2016-11-09",1500.0,200.0,10);
        empDao.insert(emp);
        empDao.delete(emp);
        empDao.update(emp);
        Emp emp2 = empDao.getEmpByEmpno(7369);
        //注意sql注入

    }
}
