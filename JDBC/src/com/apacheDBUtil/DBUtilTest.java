package com.apacheDBUtil;

import com.dao.Emp;
import com.util.MYSQLDBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;

import javax.management.Query;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Auther:PEX
 * @Date:2020/7/21-12:01
 * @Description: com.apacheDBUtil
 * @version:1.8
 */
public class DBUtilTest {
    public static Connection connection;

    public static void testQuery() throws SQLException {
        connection = MYSQLDBUtil.getConnection();
        String sql = "select * from emp where empno=?";
        QueryRunner runner = new QueryRunner();
        Emp query = runner.query(connection,sql,new BeanHandler<Emp>(Emp.class),7369);
        System.out.println(query);
        connection.close();
    }
    public static void testList() throws SQLException {
        connection = MYSQLDBUtil.getConnection();
        String sql = "select * from emp";
        QueryRunner runner = new QueryRunner();
        List<Emp> query = runner.query(connection,sql,new BeanListHandler<>(Emp.class));
        for (Emp emp :query){
            System.out.println(emp);
        }
        connection.close();
    }
    public static void testArray() throws SQLException {
        connection = MYSQLDBUtil.getConnection();
        String sql = "select * from emp";
        QueryRunner runner = new QueryRunner();
        Object[] object = runner.query(connection,sql,new ArrayHandler());
        for (Object o :object){
            System.out.println(o);
        }
        connection.close();
    }
    public static void  testArrayList() throws SQLException {
        connection = MYSQLDBUtil.getConnection();
        String sql = "select * from emp";
        QueryRunner runner = new QueryRunner();
        List<Object[]> query = runner.query(connection, sql, new ArrayListHandler());
        for (Object[] objects : query) {
            System.out.println(objects[0] + "-----" + objects[1]);
        }
        connection.close();
    }
    public static void testMap() throws SQLException {
        connection = MYSQLDBUtil.getConnection();
        String sql = "select * from emp";
        QueryRunner runner = new QueryRunner();
        Map<String,Object> query = runner.query(connection,sql,new MapHandler());
        Set<Map.Entry<String,Object>> entries = query.entrySet();
        for (Map.Entry<String,Object> entry :entries){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
        connection.close();
    }
    public static void testScalarHandler() throws SQLException {
        connection = MYSQLDBUtil.getConnection();
        String sql = "select count(*) from emp";
        QueryRunner runner =new QueryRunner();
        Object query = runner.query(connection,sql,new ScalarHandler<>());
        System.out.println(query);
        connection.close();
    }

    public static void insert() throws SQLException {
        String sql = "insert into emp(empno,ename) values(?,?)";
        connection = MYSQLDBUtil.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        queryRunner.update(connection,sql,1234,"msb");
        connection.close();
    }
    public static void update() throws SQLException {
        String sql = "update emp set ename=? where empno =?";
        connection = MYSQLDBUtil.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        queryRunner.update(connection,sql,"pex",1234);
        connection.close();
    }

    public static void delete() throws SQLException {
        String sql = "delete from emp where empno=?";
        connection = MYSQLDBUtil.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        queryRunner.update(connection,sql,1234);
        connection.close();
    }

    public static void main(String[] args) throws SQLException {
//        testQuery();
//        testArray();
        //testArrayList();
        //testList();
        //testMap();
//        testScalarHandler();
//        insert();
//        update();
        delete();
    }

}
