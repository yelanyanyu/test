package com.FileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String filePath="e:\\picture01.jpg";
        Filecopy(filePath,"e:\\");
    }

    public static void Filecopy(String filePath,String dirPath){
        byte[] bytes = new byte[1024];
        int readLen=0;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(dirPath+"picture02.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            while ((readLen=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
