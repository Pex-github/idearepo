package com.pex.thread;

/**
 * @Auther:PEX
 * @Date:2020/6/29-16:37
 * @Description: com.pex.thread
 * @version:1.8
 */

/*
*案例：
*线程一：正向输出1~10的整数
*线程二：逆向输出1~10
*要求两者交替输出
*
* 使用sleep()方法阻塞当前线程
*
* */

public class Test1 implements Runnable{


    @Override
    public void run() {
        for (int i = 0;i <10;i++){
            System.out.println(Thread.currentThread().getName() + "----->" + i);
            try {
                Thread.sleep(1050);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args){
        Test1 test1 = new Test1();
        Thread thread = new Thread(test1);
        thread.start();
        for(int i = 10;i > 0;i--){
            System.out.println(Thread.currentThread().getName() + "----->" + i);
            try {
                thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
