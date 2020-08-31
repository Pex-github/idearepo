package com.Stream;

import java.io.File;
import java.io.IOException;

/**
 * @Auther:PEX
 * @Date:2020/6/24-15:04
 * @Description: com.Stream
 * @version:1.8
 */
public class FileNew {
    public static void main(String[] args){
        File file = new File("E:\\java20\\IDEA_WorkSpace\\TestProject\\src","abc.txt");
        File file1 = new File("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\aaa.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
