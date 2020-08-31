package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

/**
 * @Auther:PEX
 * @Date:2020/6/22-15:57
 * @Description: com.collection
 * @version:1.8
 */
public class CollectionReview {
    public static void main(String[] args){
        test1();
    }
    private static void test1(){
        Collection<String> collection  = new Vector<>();
        collection.add("abc");
        collection.add("def");
        collection.add("ghi");
        collection.add("hello");

        Collection<String> coll = new ArrayList<>();
        coll.add("nihao");
        coll.add("nishi");
        coll.add("jiuzhe");
        //iterator 迭代器  方式一
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+"\t");
        }
        System.out.println("\n"+"--------------------");
        //方式二，for循环完iterator1就会被销毁，节约内存，提高效率
        for(Iterator<String> iterator1 = collection.iterator();iterator1.hasNext();){
            System.out.println(iterator1.next()+"\t");
        }
        System.out.println("\n"+"--------------------");

        Object[] array = collection.toArray();//转换为Object类型数组
        for(Object string :array){
            System.out.println(string+" ");
        }
        System.out.println("\n"+"--------------------");

        String[] arr = new String[collection.size()];
        String[] array2 = collection.toArray(arr);
        for(String string: array2){
            System.out.println(string + " ");
        }
    }

}
