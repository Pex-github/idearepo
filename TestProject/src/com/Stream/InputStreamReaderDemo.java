package com.Stream;

import java.io.*;

/**
 * @Auther:PEX
 * @Date:2020/6/24-18:17
 * @Description: com.Stream
 * @version:1.8
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) {
        File file = new File("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\aaa.txt");
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;

        try {
            fileInputStream =new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream);
            char[] chars = new char[1024];
            int length = inputStreamReader.read(chars);
            System.out.println(new String(chars,0,length));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
