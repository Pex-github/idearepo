package com.pex;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * @Auther:PEX
 * @Date:2020/8/23-15:49
 * @Description: com.pex
 * @version:1.8
 * 输入输出P56
 */
public class InputTest {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("what's your name:");
//        String name = in.nextLine();
//
//        System.out.print("How old are you: ");
//        int age = in.nextInt();
//        System.out.println("Hey," + name + ". next year,you'll be " + (age + 1));
//        System.out.printf("Hello, %s .Next year,you'll be %d",name,age);
        System.out.printf("%tc",new Date());
        System.out.println("\n" + "-----------------------");
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
    }
}
