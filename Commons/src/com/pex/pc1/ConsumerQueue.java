package com.pex.pc1;

import java.util.concurrent.BlockingQueue;

/**
 * @Auther:PEX
 * @Date:2020/6/30-17:03
 * @Description: com.pex.pc1
 * @version:1.8
 */
public class ConsumerQueue implements Runnable{

    private BlockingQueue<Goods> blockingQueue;

    public ConsumerQueue(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            try {
                Goods goods = blockingQueue.take();
                System.out.println("消费者拿取了" + goods.getBrand() +"---"+ goods.getName());
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
