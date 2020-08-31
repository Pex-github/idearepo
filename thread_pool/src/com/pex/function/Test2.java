package com.pex.function;

import sun.management.Agent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Auther:PEX
 * @Date:2020/7/6-11:20
 * @Description: com.pex.function
 * @version:1.8
 */
public class Test2 {
    public static void main(String[] args) {
        Supplier<Person> s1 = ()->new Person();
        Supplier<Person> s2 = Person::new;
        s1.get();
        s2.get();

        Supplier<List> s3 = ArrayList::new;
        Supplier<Set> s4 = HashSet::new;
        Supplier<Thread> s5 = Thread::new;
        Supplier<String> s6 = String::new;

        Consumer<Integer> c1 = (i)->new Account(i);
        Consumer<String> c2 = (str)->new Account(str);
        Consumer<Integer> c3 = Account::new;
        Consumer<String> c4 = Account::new;

        c1.accept(123);
        c2.accept("abc");
        c3.accept(123);
        c4.accept("def");

        Function<String,Account> f1 = (str)->new Account(str);
        Function<String,Account> f2 = Account::new;
        f1.apply("jiu");
        f2.apply("shi");
    }
}
class Person{
    public Person(){
        System.out.println("Person类调用无参的构造方法");
    }
}
class Account{
    public Account(){
        System.out.println("Account类调用无参构造方法");
    }
    public Account(int i){
        System.out.println("Account类i 参数构造" + i);
    }
    public Account(String str){
        System.out.println("Account类str 参数构造" + str);
    }
}