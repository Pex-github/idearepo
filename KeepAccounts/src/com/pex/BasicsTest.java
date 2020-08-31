package com.pex;

/**
 * @Auther:PEX
 * @Date:2020/8/23-15:27
 * @Description: com.pex
 * @version:1.8
 * 构建字符串P54
 */
public class BasicsTest {
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(" World!");
        builder.append(123);
        System.out.println(builder.toString());
        String completedString = builder.toString();
        System.out.println(completedString);
    }
}
