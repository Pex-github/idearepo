package com.collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Auther:PEX
 * @Date:2020/6/22-22:08
 * @Description: com.collection
 * @version:1.8
 */
public class VectorReview {
    public static void main(String[] args){
        Vector v = new Vector(3,2);//指定向量大小和向量每次增加的元素的数目
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());//返回此向量的当前容量。
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity after four additions： " + v.capacity());

        v.addElement(new Double(3.14));
        System.out.println("Current Capacity： " + v.capacity());
        v.addElement(new Double(4.12));
        v.addElement(new Integer(5));
        System.out.println("Current Capacity： " + v.capacity());
        v.addElement(new Float(6.1));
        v.addElement(new Integer(7));
        System.out.println("Current Capacity： " + v.capacity());
        System.out.println("First element: " + (Integer)v.firstElement());
        System.out.println("Last element: " + (Integer)v.lastElement());
        //boolean contains(Object elem)
        //如果此向量包含指定的元素，则返回 true。
        if(v.contains(new Integer(3))){
            System.out.println("Vector contains 3");
        }
        Enumeration vEum = v.elements();
        //Enumeration接口中定义了一些方法，通过这些方法可以枚举（一次获得一个）对象集合中的元素。
        //boolean hasMoreElements( )
        //测试此枚举是否包含更多的元素。
        //Object nextElement( )
        //如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素。
        System.out.println("Elements in vector: ");
        while(vEum.hasMoreElements())
            System.out.println(vEum.nextElement() + "\t");
        System.out.println(" ");



    }
}
