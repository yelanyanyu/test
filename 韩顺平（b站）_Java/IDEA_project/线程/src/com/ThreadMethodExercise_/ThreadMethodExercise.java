package com.ThreadMethodExercise_;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) {
        T1 t1 = new T1();
        Thread thread = new Thread(t1);
        int count=0;
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi");
                if(++count==5){
                    System.out.println("子线程加入");
                    thread.start();
                    thread.join();
                    System.out.println("子线程结束");
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");
    }
}


class T1 implements Runnable{
    public int count=0;
    @Override
    public void run() {
        try {
            while(true){
                if(count==10){
                    break;
                }
                Thread.sleep(1000);
                System.out.println("子线程：hello"+(++count));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class T2 implements Runnable{
    public int count=0;
    @Override
    public void run() {
        try {
            while(true){
                if(count==10){
                    break;
                }
                Thread.sleep(500);
                System.out.println("子线程：hello"+(++count));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}