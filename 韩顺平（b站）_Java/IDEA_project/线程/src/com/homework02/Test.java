package com.homework02;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Custom01 custom01 = new Custom01();
        Thread thread01 = new Thread(custom01);
        Thread thread02 = new Thread(custom01);
        thread01.start();
        thread02.start();
    }
}


class Custom01 implements Runnable {
    private int sal=10000;
    @Override
    public void run()  {
        while (true){
            synchronized (this) {
                if(sal==0){
                    break;
                }
                try {
                    Thread.sleep(1);
                    System.out.println("余额为："+(sal=sal-1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+"结束");
    }
}

