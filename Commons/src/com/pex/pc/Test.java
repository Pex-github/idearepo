package com.pex.pc;

/**
 * @Auther:PEX
 * @Date:2020/6/30-15:16
 * @Description: com.pex.pc
 * @version:1.8
 */

/*
* 生产者与消费者实例
* 输出如下：
*生产者生产了娃哈哈--矿泉水
*消费者拿走了娃哈哈---矿泉水
*生产者生产了旺仔--小馒头
*消费者拿走了旺仔---小馒头
*生产者生产了娃哈哈--矿泉水
*消费者拿走了娃哈哈---矿泉水
*生产者生产了旺仔--小馒头
*消费者拿走了旺仔---小馒头
*...
*
* 注意：多线程访问会出现以下数据安全问题
* 1.生产者没有生产商品，消费者就取走
* 2.商品的品牌名和名称对应不上
*
*producer生产产品，将产品放置到共享空间中
*
*consumer从共享空间中取走产品
*
*set()方法：当生产者抢占到cpu资源之后会判断当前对象是否有值，如果有的话，以为着消费者还没有消费，需要提醒消费者消费，同时
*当前线程进入阻塞状态，等待消费者取走商品之后，再次生产，如果没有的话，不需要等待，不需要进入阻塞状态，直接生产即可
*
*get()方法：如果flag等于false的话，意味着生产者没有生产商品，此时消费者无法消费，需要让消费者线程进入到阻塞状态，等待生产者生产，当
* 有商品之后，再开始消费
*
*flag参数   默认是不存在商品的，如果值等于true的话，代表有商品
*
*notify();  唤醒正在wait()的线程
*
* */
public class Test {
    public static void main(String[] args) {

        Goods goods = new Goods();

        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }


}
