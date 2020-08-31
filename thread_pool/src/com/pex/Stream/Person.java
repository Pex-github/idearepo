package com.pex.Stream;

/**
 * @Auther:PEX
 * @Date:2020/7/7-9:31
 * @Description: com.pex.Stream
 * @version:1.8
 */
public class Person {
    private String name;
    private int age;

    public Person(){

    }
    public void Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    public static Person build(String name){
        Person p = new Person();
        p.setName(name);
        return p;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(15);
        p1.setName("zhangsan");
        System.out.println(p1.toString());
    }
}
