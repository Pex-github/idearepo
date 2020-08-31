package com.pex.pc;

/**
 * @Auther:PEX
 * @Date:2020/6/30-15:14
 * @Description: com.pex.pc
 * @version:1.8
 */
public class Goods {
    private String brand;
    private String name;
    private boolean flag = false;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBrand(){
        return brand;
    }
    public String getName(){
        return name;
    }

    public  synchronized void set(String brand, String name){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了" + this.getBrand() +"--" + this.getName());
        flag = true;
        //唤醒消费者拿走产品
        notify();
    }
    public synchronized void get(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者拿走了" + this.getBrand() +"---" + this.getName());
        flag = false;
        //唤醒生产者生产产品
        notify();

    }
}
