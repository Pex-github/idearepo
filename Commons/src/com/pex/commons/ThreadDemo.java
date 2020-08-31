package com.pex.commons;

/**
 * @Auther:PEX
 * @Date:2020/6/26-17:29
 * @Description: com.pex.commons
 * @version:1.8
 */
public class ThreadDemo extends Thread{
    @Override
    public void run(){
        for (int i = 0;i < 10;i++){
            System.out.println(Thread.currentThread().getName()+"-------"+ i );

        }
    }
    public static void main(String[] args){
        ThreadDemo threadDemo= new ThreadDemo();
        threadDemo.start();
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"=========" + i);
        }
    }
}

