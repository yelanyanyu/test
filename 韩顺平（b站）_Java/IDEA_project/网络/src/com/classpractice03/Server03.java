package com.classpractice03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Server03 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        byte[] buf = new byte[1024];
        int readlen=0;
        while ((readlen=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readlen));
        }

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client");
        bufferedWriter.flush();
        socket.shutdownOutput();

        socket.close();
        bufferedReader.close();
        bufferedWriter.close();
        serverSocket.close();
    }
}
