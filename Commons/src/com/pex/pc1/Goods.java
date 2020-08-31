package com.pex.pc1;

/**
 * @Auther:PEX
 * @Date:2020/6/30-17:03
 * @Description: com.pex.pc1
 * @version:1.8
 */
public class Goods {

        private String brand;
        private String name;

        public Goods(String brand,String name){
            this.brand = brand;
            this.name = name;
        }

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
}
