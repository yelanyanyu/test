package com.多线程售票问题;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Window01 extends Windows implements Runnable {

    public Window01() {
    }

    public Window01(int sum) {
        super(sum);
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (times == Sum) {
                    break;
                }
                System.out.printf("窗口1已处理完%d个人\n",++times);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
