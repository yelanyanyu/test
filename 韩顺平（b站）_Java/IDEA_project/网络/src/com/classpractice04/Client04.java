package com.classpractice04;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Client04 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        BufferedInputStream bis_tofile = new BufferedInputStream(new FileInputStream("e:\\picture01.jpg"));
        byte[] data_jpg = StreamUtils.streamToByteArray(bis_tofile);

        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bos_net = new BufferedOutputStream(outputStream);
        bos_net.write(data_jpg);
        bos_net.flush();
        socket.shutdownOutput();

        socket.close();
        bis_tofile.close();
        bos_net.close();
    }
}


