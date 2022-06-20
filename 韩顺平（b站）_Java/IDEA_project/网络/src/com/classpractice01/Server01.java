package com.classpractice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Server01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket01 = serverSocket.accept();
        InputStream inputStream = socket01.getInputStream();
        byte []buf= new byte[1024];
        int readlen=0;


        while ((readlen=inputStream.read(buf))!=-1){
            System.out.println("接收到的信息为："+new String(buf,0,readlen));
        }


        inputStream.close();
        socket01.close();
        serverSocket.close();
    }
}
