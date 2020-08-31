package com.ReadorWriter;

import java.io.CharArrayWriter;
import java.io.File;

/**
 * @Auther:PEX
 * @Date:2020/6/25-13:02
 * @Description: com.ReadorWriter
 * @version:1.8
 */
public class CharArrayWriterDemo {
    public static void main(String[] args){
        File file = new File("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\123.txt");
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int[] buffer = new int[1024];
        charArrayWriter.write("www.PEX.com",0,11);
        System.out.println(charArrayWriter);
        charArrayWriter.close();
    }
}
