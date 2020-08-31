package com.pex.thread;

/**
 * @Auther:PEX
 * @Date:2020/6/29-17:47
 * @Description: com.pex.thread
 * @version:1.8
 */

/**
 *数据不一致的解决办法：线程同步
 *
 */

public class ThreadDemo implements Runnable{

    private int ticket = 5;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(this){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName() + "正在售出第" + (ticket--) + "张票");
                }
            }
        }
    }

    public static void main(String[] args){
        ThreadDemo ticket = new ThreadDemo();
        Thread t1 = new Thread(ticket,"A");
        Thread t2 = new Thread(ticket,"B");
        Thread t3 = new Thread(ticket,"C");
        Thread t4 = new Thread(ticket,"D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
