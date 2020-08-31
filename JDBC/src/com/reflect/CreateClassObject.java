package com.reflect;

import com.dao.Emp;

/**
 * @Auther:PEX
 * @Date:2020/7/18-21:00
 * @Description: com.reflect
 * @version:1.8
 */
public class CreateClassObject {
    public static void main(String[] args){
        Class clazz = new Emp().getClass();
        System.out.println(clazz.getPackage());
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getCanonicalName());

        Class type = Integer.TYPE;
        System.out.println(type.getName());
        System.out.println(type.getCanonicalName());

    }
}
