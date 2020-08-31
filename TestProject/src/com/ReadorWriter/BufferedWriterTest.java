package com.ReadorWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther:PEX
 * @Date:2020/6/25-13:42
 * @Description: com.ReadorWriter
 * @version:1.8
 */
public class BufferedWriterTest {
    public static void main(String[] args){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\abc.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append("你好，你是谁？");
            bufferedWriter.newLine();
            bufferedWriter.append("学习马氏java");
            bufferedWriter.flush();
        } catch (IOException e) {

        }finally{
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
