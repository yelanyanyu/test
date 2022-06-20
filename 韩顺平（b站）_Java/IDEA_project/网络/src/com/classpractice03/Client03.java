package com.classpractice03;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Client03 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server");
        bufferedWriter.flush();
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        int readlen=0;
        byte[] bytes = new byte[1024];
        while ((readlen=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,readlen));
        }
        System.out.println("收到消息");


//        bufferedWriter.close();
        inputStream.close();
        socket.close();

    }
}
