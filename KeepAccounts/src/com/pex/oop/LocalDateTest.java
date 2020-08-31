package com.pex.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 * @Auther:PEX
 * @Date:2020/8/24-17:38
 * @Description: com.pex
 * @version:1.8
 * P103
 */
public class LocalDateTest {
    public static void main(String[] args) {
        System.out.println(new Date());
        String s  = new Date().toString();
        LocalDate today = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateStr = today.format(fmt);
        System.out.println(dateStr);

    }
}
