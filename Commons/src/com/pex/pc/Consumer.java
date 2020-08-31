package com.pex.pc;

/**
 * @Auther:PEX
 * @Date:2020/6/30-15:16
 * @Description: com.pex.pc
 * @version:1.8
 */
public class Consumer implements Runnable {

    private Goods goods;

    public Consumer (Goods goods){
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            goods.get();
        }
    }
}
