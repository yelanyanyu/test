package com.classpractice05_UDP;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Sender_A {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);

        byte []data="hello,wdnmd".getBytes(StandardCharsets.UTF_8);
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 9999);
        socket.send(packet);

        byte[] data01 = new byte[64*1024];
        DatagramPacket packet1 = new DatagramPacket(data01, data01.length);
        socket.receive(packet1);
        System.out.println(new String(packet1.getData(),0, packet1.getLength(),"utf-8"));

        socket.close();
    }
}
