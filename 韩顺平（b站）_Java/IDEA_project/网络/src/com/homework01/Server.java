package com.homework01;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待接收...");

        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bis_net = new BufferedInputStream(inputStream);
        int readlen = 0;
        byte[] data_net = new byte[1024];
        String str = "";
        while ((readlen = bis_net.read(data_net)) != -1) {
            str = new String(data_net, 0, readlen);
            if (str.equals("name")) {
                System.out.println("我是你爹");
            } else if (str.equals("hobby")) {
                System.out.println("编写java程序");
            } else {
                System.out.println("马冬什么？");
            }
        }

        serverSocket.close();
        socket.close();
        bis_net.close();
    }
}
