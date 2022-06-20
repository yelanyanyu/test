package com.homework02;

import java.io.*;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            String readlen = "";
            int linenum=0;
            bufferedReader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("e:\\f1.txt"),"gbk"));
            while ((readlen=bufferedReader.readLine())!=null){
                System.out.println((++linenum)+readlen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
