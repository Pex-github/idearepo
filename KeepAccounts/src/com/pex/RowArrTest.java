package com.pex;

import sun.font.FontRunIterator;

import java.util.Arrays;

/**
 * @Auther:PEX
 * @Date:2020/8/23-18:36
 * @Description: com.pex
 * @version:1.8
 */
public class RowArrTest {
    public static void main(String[] args) throws Exception {
        int[][] arr1 =new int[10][];
        for (int i = 0; i < 10; i++)
            arr1[i] = new int[i+1];
            for (int j = 0; j <arr1.length ; j++) {
                for (int k = 0; k <arr1[j].length ; k++) {

                    int lotteryArr = 1;
                    for (int l = 0; l < k; l++)
                        lotteryArr = lotteryArr * (j-l+1)/l;

                    arr1[j][k] =lotteryArr;
                }
                for(int[] row :arr1){
                    for (int odd : row)
                        System.out.printf("%4d",odd);
                    System.out.println();
                }
            }
        }
    }

