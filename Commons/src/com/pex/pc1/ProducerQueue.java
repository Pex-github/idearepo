package com.pex.pc1;

import java.util.concurrent.BlockingQueue;

/**
 * @Auther:PEX
 * @Date:2020/6/30-17:03
 * @Description: com.pex.pc1
 * @version:1.8
 */
public class ProducerQueue implements Runnable {

    private BlockingQueue<Goods> blockingQueue;

    public ProducerQueue(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Goods goods = null;
            if(i%2 ==0){
                goods = new Goods("娃哈哈","矿泉水");
            }else{
                goods = new Goods("旺仔","小馒头");
            }
            System.out.println("生产者生产了" + goods.getBrand() +"--"+ goods.getName() + i);
            try {
                blockingQueue.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
