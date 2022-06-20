package com.多线程售票问题;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class TestWindow extends Thread{
    public int times = 0;
    public int Sum = 0;
    public TestWindow(int sum){
        this.Sum=sum;
    }
    public TestWindow() {}
    @Override
    public void run() {
        try {
            while (true) {
                if (times == Sum) {
                    break;
                }
                System.out.printf("窗口4已处理完%d个人\n",++times);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
