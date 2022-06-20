package com;

/*
  @author yelanyanyu@zjxu.edu.cn  
  @verson 1.0
*/
public class Test {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testwork(new Computer() {
            @Override
            public void Calculate() {
                System.out.println("完成了手机1运算...");
            }
        });
    }
}

interface Computer{
    void Calculate();
}

class Cellphone implements Computer{

    @Override
    public void Calculate() {
        System.out.println("完成了计算任务...");
    }
    @SuppressWarnings("all")
    public void testwork(Computer computer){
        computer.Calculate();
    }

}