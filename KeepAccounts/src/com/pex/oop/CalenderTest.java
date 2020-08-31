package com.pex.oop;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

/**
 * @Auther:PEX
 * @Date:2020/8/24-18:00
 * @Description: com.pex
 * @version:1.8
 */
public class CalenderTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
//        System.out.println(month);
        System.out.println(today);
//        System.out.println(month + " ,"  + today);
        date = date.minusDays(today - 1);
        System.out.println(date);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println(value);
        System.out.println(date.getMonthValue());
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 0;i <value;i++)
            System.out.print("   ");
        while(date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
