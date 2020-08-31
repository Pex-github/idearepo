package com.Stream;

import java.io.*;

/**
 * @Auther:PEX
 * @Date:2020/6/24-17:40
 * @Description: com.Stream
 * @version:1.8
 */
public class OutStreamWriterDemo {
    public static void main(String[] args) {
        File file = new File("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\writer.txt");
        OutputStreamWriter outputStreamWriter = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream,"UTF-8");
            //编码方式UTF-8
            outputStreamWriter.write(97);
            outputStreamWriter.write("bcdefgh",0,5);
            outputStreamWriter.write("你好！马士兵");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
