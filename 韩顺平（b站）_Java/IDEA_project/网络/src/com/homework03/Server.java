package com.homework03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Server {
    public static void main(String[] args) throws Exception {
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
        }

        String filePath = "e:\\" + str;
        BufferedInputStream bis_file = null;
        byte[] data_file = new byte[0];
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            bis_file = new BufferedInputStream(fileInputStream);
            data_file = StreamUtils.streamToByteArray(bis_file);
        } catch (Exception e) {
            System.out.println("请输入存在的文件名");
        } finally {
            bis_file.close();
        }

        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bos_net = new BufferedOutputStream(outputStream);
        bos_net.write(data_file);
        bos_net.flush();
        socket.shutdownOutput();

        serverSocket.close();
        socket.close();
        bos_net.close();
        bis_net.close();
    }
}
