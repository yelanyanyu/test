package com.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] data = "四大名著是什么".getBytes(StandardCharsets.UTF_8);

        DatagramPacket packet_send = new DatagramPacket(data, data.length, InetAddress.getLocalHost(),8888);
        datagramSocket.send(packet_send);

        datagramSocket.close();
    }
}
