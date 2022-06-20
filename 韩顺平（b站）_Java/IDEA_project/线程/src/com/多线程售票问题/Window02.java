package com.多线程售票问题;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Window02 extends Windows implements Runnable{

    public Window02(int sum) {
        super(sum);
    }

    public Window02() {
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (times == Sum) {
                    break;
                }
                System.out.printf("窗口2已处理完%d个人\n",++times);
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
