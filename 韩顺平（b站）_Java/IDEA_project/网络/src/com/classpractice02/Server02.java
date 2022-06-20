package com.classpractice02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Server02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端等待接受数据：");
        Socket socket = serverSocket.accept();


        InputStream ins = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(ins);
        byte[] data = new byte[1024];
        int readlen=0;
        while ((readlen=bis.read(data))!=-1){
            System.out.println(new String(data,0,readlen));
        }

        OutputStream ous = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(ous);
        bos.write("hello,client".getBytes());
        bos.flush();
        socket.shutdownOutput();

        socket.close();
        bis.close();
        bos.close();
        serverSocket.close();
    }
}
