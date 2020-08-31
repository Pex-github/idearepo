package com.pex.protest;

import com.sun.corba.se.spi.orb.Operation;

import javax.xml.soap.Detail;
import java.util.Scanner;

/**
 * @Auther:PEX
 * @Date:2020/8/15-11:35
 * @Description: com.pex
 * @version:1.8
 */
public class Test {
    public static void main(String[] args){
        String operating = "";
        int balance = 0;
        while(true){
            System.out.println("欢迎使用收入记账系统");
            System.out.println("1.收入明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退出");
            System.out.println("请输入你要选择的功能：");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            while(choice!=1&&choice!=2&&choice!=3&&choice!=4){
                System.out.println("选择功能错误，请重新选择：");
                int newChoice = sc.nextInt();
                choice = newChoice;
            }
            switch(choice){
                case 1:
                    System.out.println("记账系统》》》》收支明细");
                    if(operating!=""){
                        System.out.println(operating.substring(0,operating.length()-1));
                    }else {
                        System.out.print(operating);
                    }
                    break;
                case 2:
                    System.out.println("记账系统》》》》登记收入");
                    System.out.println("请登记录入收入金额");
                    int income = sc.nextInt();
                    System.out.println("请录入收入说明：");
                    String incomeDetail = sc.next();
                    balance += income;
                    operating = operating + "收入：" + income +",说明：" + incomeDetail + ",余额：" + balance + "\n";
                    break;
                case 3:
                    System.out.println("记账系统》》》》登记支出");
                    System.out.println("请登记录入支出金额");
                    int expend = sc.nextInt();
                    System.out.println("请录入收入说明：");
                    String expendDetail = sc.next();
                    balance -= expend;
                    operating = operating + "支出：" + expend +",说明：" + expendDetail + ",余额：" + balance + "\n";

                    break;
                case 4:
                    System.out.println("记账系统》》》》退出");
                    System.out.println("确认是否退出Y/N?");
                    String isExit =sc.next();
                    switch (isExit){
                        case "Y" :
                            System.out.println("退出成功");
                            return;
                        default:
                            break;
                    }

            }
        }
    }
}
