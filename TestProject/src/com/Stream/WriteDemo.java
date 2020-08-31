package com.Stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Auther:PEX
 * @Date:2020/6/24-16:52
 * @Description: com.Stream
 * @version:1.8
 */
public class WriteDemo {
    public static void main(String[] args){
        File file = new File("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\write.txt");
        Writer writer =null;
        try {
            file.createNewFile();
            writer = new FileWriter(file);
            writer.write("wwww.pex.com/Stream");
            writer.write("你好，马士兵");
            writer.flush();//强制把缓存导入到文件
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
