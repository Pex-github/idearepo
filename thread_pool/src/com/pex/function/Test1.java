package com.pex.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Auther:PEX
 * @Date:2020/7/6-10:58
 * @Description: com.pex.function
 * @version:1.8
 */
public class Test1 {
    static String put(){
        System.out.println("put...");
        return "put";
    }
    public static void getSize(int size){
        System.out.println(size);
    }
    public static String toUpperCase(String str){
        return str.toUpperCase();
    }
    public static Integer gteLength(String str ,String str2){
        return str.length() + str2.length();
    }
    public static void main(String[] args){
        Supplier<String> s1 = ()->Test1.put();
        System.out.println(s1.get());

        Supplier<String> s2 = Test1::put;
        System.out.println(s2.get());

        Supplier<String> s3 = Fun::hehe;
        System.out.println(s3.get());

        Consumer<Integer> c1 = (size)->Test1.getSize(size);
        Consumer<Integer> c2 = Test1::getSize;

        Function<String,String> f1 = (str)->str.toUpperCase();
        Function<String,String> f2 = (str)->Test1.toUpperCase(str);
        Function<String,String> f3 = Test1::toUpperCase;
        Function<String,String> f4 = Fun::toUpperCase;

        System.out.println(f1.apply("abc"));
        System.out.println(f2.apply("abc"));
        System.out.println(f3.apply("abc"));
        System.out.println(f4.apply("abc"));

    }

    static class Fun{
        public static String hehe(){
            return "hehe";
        }
        public static String toUpperCase(String str){
            return str.toUpperCase();
        }
    }
}
