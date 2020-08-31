package com.pex.Cliebt;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Auther:PEX
 * @Date:2020/7/3-16:56
 * @Description: com.pex.Cliebt
 * @version:1.8
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //指定ip地址和端口号
        Socket client = new Socket("localhost",10086);
        OutputStream outputStream = client.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("hello,你好");
        dataOutputStream.close();
        outputStream.close();
        client.close();

    }
}
