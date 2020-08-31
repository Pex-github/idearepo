package com.reflect;

/**
 * @Auther:PEX
 * @Date:2020/7/18-20:59
 * @Description: com.reflect
 * @version:1.8
 */
public class Person {
    public String name;
    public int age;

    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String show(){
        return "name:" + name + ",age :" + age;
    }
}
