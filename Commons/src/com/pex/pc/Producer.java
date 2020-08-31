package com.pex.pc;

import javax.naming.Name;

/**
 * @Auther:PEX
 * @Date:2020/6/30-15:15
 * @Description: com.pex.pc
 * @version:1.8
 */
public class Producer implements Runnable {

    private Goods goods;

    public Producer(Goods goods){
        this.goods = goods;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0){
                goods.set("娃哈哈","矿泉水");
            }else {
                goods.set("旺仔","小馒头");
            }
        }

    }
}
