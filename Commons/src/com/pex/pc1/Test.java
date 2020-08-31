package com.pex.pc1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * @Auther:PEX
 * @Date:2020/6/30-17:03
 * @Description: com.pex.pc1
 * @version:1.8
 */
/*
*生产者消费者简单实例pro
* 加入了队列
* 可以共享队列存放更多的商品
* BlockingQueue
*
*
* */

public class Test {
    public static void main(String[] args) {
        BlockingQueue<Goods> queue = new ArrayBlockingQueue<Goods>(5);
        ProducerQueue producerQueue = new ProducerQueue(queue);
        ConsumerQueue consumerQueue = new ConsumerQueue(queue);

        new Thread(producerQueue).start();
        new Thread(consumerQueue).start();
    }

}
