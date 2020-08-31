package com.ReadorWriter;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @Auther:PEX
 * @Date:2020/6/25-11:47
 * @Description: com.ReadorWriter
 * @version:1.8
 */
public class CharArrayReaderDemo {
    public static void main(String[] args) {
        char[] chars = "你好，你是谁".toCharArray();
        CharArrayReader charArrayReader = new CharArrayReader(chars);
        try {
            int read = 0;
            while((read = charArrayReader.read())!=-1){
                System.out.println((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            charArrayReader.close();
        }


    }
}
