package com.classpractice04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Server04 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        byte[] data = StreamUtils.streamToByteArray(inputStream);
        String destfilePath="src\\1.jpg";
        FileOutputStream fileOutputStream = new FileOutputStream(destfilePath);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(data);
        bufferedOutputStream.close();

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("收到图片");
        bufferedWriter.flush();
        socket.shutdownOutput();

        socket.close();
        bufferedWriter.close();
        serverSocket.close();
        inputStream.close();
    }
}
