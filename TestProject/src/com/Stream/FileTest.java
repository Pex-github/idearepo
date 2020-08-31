package com.Stream;

import java.io.File;

/**
 * @Auther:PEX
 * @Date:2020/6/24-14:47
 * @Description: com.Stream
 * @version:1.8
 */
public class FileTest {
    public static void main(String[] args){
        File file1 = new File("hello.txt");
        File file2 = new File("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\com\\Stream");
        System.out.println(file1);
        System.out.println(file2);

        File file3 = new File("E:\\java20\\IDEA_WorkSpace\\TestProject\\src\\com","Stream");
        System.out.println(file3);
    }
}
