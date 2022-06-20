package com.classpractice05_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Receiver_A {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        System.out.println("等到接收...");

        socket.receive(packet);
        byte[] data1 = packet.getData();
        System.out.println(new String(data1, 0, packet.getLength()));

        data = "好的，明天见".getBytes();
        socket.send(new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 9998));

        socket.close();
        System.out.println("接收端退出");
    }
}
