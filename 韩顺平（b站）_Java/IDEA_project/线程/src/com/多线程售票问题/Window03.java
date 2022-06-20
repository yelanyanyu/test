package com.多线程售票问题;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Window03 extends Windows implements Runnable{
    public Window03(int sum) {
        super(sum);
    }

    public Window03() {
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (times == Sum) {
                    break;
                }
                System.out.printf("窗口3已处理完%d个人\n",++times);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
