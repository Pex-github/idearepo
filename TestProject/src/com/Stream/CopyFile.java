package com.Stream;

import java.io.*;

/**
 * @Auther:PEX
 * @Date:2020/6/24-14:09
 * @Description: com.Stream
 * @version:1.8
 */
public class CopyFile {
    public static void main(String[] args){
        //创建源数据文件
        File src = new File("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\abc.txt");
        //创建目的数据文件
        File dest = new File("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\aaa.txt");
        //创建输入流对象
        InputStream inputStream = null;
        //创建输出流对象
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(src);
            outputStream = new FileOutputStream(dest);

            //带缓存的输入输出方式
            byte[] buffer = new byte[1024];
            int length = 0;

            //完成数据传输的过程
            while ((length = inputStream.read(buffer))!=-1){
                outputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
