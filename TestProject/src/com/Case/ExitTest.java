package com.Case;

import java.io.*;

/**
 * @Auther:PEX
 * @Date:2020/6/25-14:19
 * @Description: com.Case
 * @version:1.8
 */
public class ExitTest {
    public static void main(String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String str = "";
            while(!str.equals("exit")) {
                str = bufferedReader.readLine();
                bufferedWriter.write(str);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
