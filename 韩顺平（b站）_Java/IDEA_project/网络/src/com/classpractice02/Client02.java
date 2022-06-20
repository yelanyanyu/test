package com.classpractice02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Spliterator;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Client02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream ous = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(ous);
        bos.write("hello,server!".getBytes());
        bos.flush();
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
//        BufferedInputStream bis = new BufferedInputStream(inputStream);
        int readlen_in=0;
        byte[] data_in = new byte[1024];
        while ((readlen_in=inputStream.read(data_in))!=-1){
            System.out.println(new String(data_in,0,readlen_in));
        }
        System.out.println("收到数据");
        bos.close();
//        bis.close();
        socket.close();
    }
}
