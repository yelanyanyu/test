package com.homework01;

import javax.swing.table.TableRowSorter;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println();
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread01 = new Thread(t1);
        Thread thread02 = new Thread(t2);
        thread01.setName("线程1");
        thread02.setName("线程2");
        thread01.start();
        thread02.start();
    }
}

class T1 implements Runnable {

    public static boolean isLoop() {
        return loop;
    }

    public static void setLoop(boolean loop) {
        T1.loop = loop;
    }

    private static boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            int num = (int) (Math.random() * 101);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(num);
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }
}

class T2 implements Runnable {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (true) {
            char c = scanner.next().toUpperCase(Locale.ROOT).charAt(0);
            if (c == 'Q') {
                T1.setLoop(false);
                System.out.println(Thread.currentThread().getName() + "结束");
                break;
            }
        }
    }
}
