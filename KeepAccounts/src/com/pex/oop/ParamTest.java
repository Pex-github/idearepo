package com.pex.oop;

import java.sql.SQLOutput;

/**
 * @Auther:PEX
 * @Date:2020/8/25-17:36
 * @Description: com.pex.oop
 * @version:1.8
 */
public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing tripleValues：方法不能修改基本数据类型的参数");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);
        System.out.println("After:percent = " + percent);

        System.out.println("方法可以改变对象参数的状态");

        System.out.println("方法本能让一个对象的参数引用一个新的对象");
        Employee a = new Employee("Alice",5000);
        Employee b = new Employee("Bob",8000);
        System.out.println("Before : a :"+ a.getName() + ", Salary = " + a.getSalary());
        System.out.println("Before : b :"+ b.getName() + ", Salary = " + b.getSalary());
        swap(a,b);
        System.out.println("After : a :"+ a.getName() + ", Salary = " + a.getSalary());
        System.out.println("After : b :"+ b.getName() + ", Salary = " + b.getSalary());


    }
    public static void tripleValue(double x ){
        x = 3 * x;
        System.out.println("End of method : x = " + x);
    }
    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println("End of method : x = " + x.getSalary());
    }
    public static void swap(Employee x,Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of methon: x = " + x.getName());
        System.out.println("End of methon: y = " + y.getName());
    }
}
