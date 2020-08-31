package com.Stream;

import java.io.*;

/**
 * @Auther:PEX
 * @Date:2020/6/24-16:01
 * @Description: com.Stream-
 * @version:1.8
 */
/*
*读取字符流，直接提取中文汉字
*
*/
public class ReadDome {
    public static void main(String[] args){
        Reader reader = null;
        Reader reader1 = null;
        try {
            reader = new FileReader("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\123.txt");
            int read = reader.read();
            System.out.println((char) read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("-----------------------------------");
        try {
            reader1 = new FileReader("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\123.txt");
            int read = 0;
            while ((read = reader1.read())!=-1) {
                System.out.println((char) read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                reader1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("-----------------------------------");
        Reader reader2 = null;
        try {
            reader2 = new FileReader("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\123.txt");
            int length = 0;
            char[] chars = new char[1024];
            //添加缓存区
            while ((length = reader2.read(chars))!=-1){
                System.out.println(new String(chars,0,length));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                reader2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
