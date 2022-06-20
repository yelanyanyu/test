package com.homework01;

import java.io.*;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        File file= null;
        try {
            file = new File("e:\\f1.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("创建成功~");
            }else {
                System.out.println("文件已存在");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("hello wdnmd!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
