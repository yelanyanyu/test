package com.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        System.out.println("等待接收数据...");

        byte[] data_rec = new byte[1024 * 64];
        DatagramPacket  packet_rec= new DatagramPacket(data_rec, data_rec.length);
        datagramSocket.receive(packet_rec);
        String str= new String(packet_rec.getData(),0, packet_rec.getLength());
        if(str.equals("四大名著是什么")){
            System.out.println("是你妈，爷不知道");
        }else {
            System.out.println("我爱你");
        }

        datagramSocket.close();
    }
}
