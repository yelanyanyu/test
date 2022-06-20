package com.homework03;

import java.io.*;
import java.util.*;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src\\com\\homework03\\dog.properties"));
            properties.list(System.out);
            propertiesRead(properties);
            serilizable();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }

    public static boolean propertiesRead(Properties properties){
        try {
            Dog dog = new Dog();
            dog.setAge(Integer.parseInt(properties.getProperty("age")));
            dog.setColor(properties.getProperty("color"));
            dog.setName(properties.getProperty("name"));
            System.out.println(dog);
            return true;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static void serilizable() throws IOException, ClassNotFoundException {
        Dog dog = new Dog();
        String filePath= "e:\\f2.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(dog);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        Dog o = (Dog) ois.readObject();
        System.out.println(o);
        oos.close();
        ois.close();
    }
}
