package com.pex.oop;

import java.time.LocalDate;

/**
 * @Auther:PEX
 * @Date:2020/8/24-18:43
 * @Description: com.pex.oop
 * @version:1.8
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("小明",2000,2020,8,1);
        staff[1] = new Employee("小红",3000,2020,8,2);
        staff[2] = new Employee("小黑",4000,2020,8,3);

        for (Employee e : staff){
            e.raiseSalary(10);
        }

        for(Employee e :staff){
            System.out.println("name:" + e.getName()+ ", salary:" +e.getSalary()
                    + ", hireDay:" + e.getHireDay());
        }
    }
}
    class Employee{
        private String name;
        private double salary;
        private LocalDate hireDay;

        public Employee(){
            System.out.println("无参构造");
        }
        public Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
        }
        public Employee(String name ,double salary ,int year ,int month ,int day){
            this.name = name;
            this.salary = salary;
            this.hireDay = LocalDate.of(year,month,day);
        }
        public String getName(){
            return name;
        }
        public double getSalary(){
            return salary;
        }
        public LocalDate getHireDay(){
            return hireDay;
        }
        public void raiseSalary(double byPercent){
            double raise = salary*byPercent/100;
            salary = salary + raise;//隐式参数   this.salary
        }
    }

