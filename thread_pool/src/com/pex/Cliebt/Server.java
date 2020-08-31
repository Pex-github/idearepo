package com.pex.Cliebt;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther:PEX
 * @Date:2020/7/3-17:08
 * @Description: com.pex.Cliebt
 * @version:1.8
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket socket = serverSocket.accept();

    }
}
