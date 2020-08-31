package com.pex;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther:PEX
 * @Date:2020/8/23-18:12
 * @Description: com.pex
 * @version:1.8
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many");
        int k = in.nextInt();
        System.out.println("highest number");
        int n = in.nextInt();

        int[] number = new int[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length ; i++) {
            int r = (int) (Math.random() * n);

            result[i] = number[r];

            number[r] = number[n-1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("------------------");
        for(int r : result){
            System.out.println(r);
        }
    }
}
