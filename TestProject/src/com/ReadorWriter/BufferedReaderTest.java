package com.ReadorWriter;

import java.io.*;

/**
 * @Auther:PEX
 * @Date:2020/6/25-13:15
 * @Description: com.ReadorWriter
 * @version:1.8
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\abc.txt"));
            //String read = reader.readLine();
            //System.out.println((String) read);
            //以上是打印一行
            String read = null;
            while((read = reader.readLine())!=null){
                System.out.println(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
