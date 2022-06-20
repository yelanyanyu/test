package com.多线程售票问题;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Window01 window01 = new Window01(80);
        Window02 window02 = new Window02(60);
        Window03 window03 = new Window03(50);
        Thread thread01 = new Thread(window01);
        Thread thread02 = new Thread(window02);
        Thread thread03 = new Thread(window03);
        thread01.start();
        thread02.start();
        thread03.start();
        TestWindow testWindow = new TestWindow(45);
        testWindow.start();
    }
}
