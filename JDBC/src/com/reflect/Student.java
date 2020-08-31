package com.reflect;

/**
 * @Auther:PEX
 * @Date:2020/7/18-20:59
 * @Description: com.reflect
 * @version:1.8
 */
public class Student extends Person{
    public String className;
    private String address;

    public Student(){
        super();
    }
    private Student(String name,int age,String className){
        super(name,age);
        this.className = className;
    }
    public Student(String name,int age,String className,String address){
        super(name,age);
        this.className = className;
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
