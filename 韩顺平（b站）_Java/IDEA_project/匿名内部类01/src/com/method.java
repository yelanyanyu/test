package com;

public class method {
    private int n1 = 100;
    public void f1(){
        new IA(){}.showinfo(new IB());
    }
}

class IA{
    public void showinfo(IB ib){
        ib.play();
    }
}

class IB{
    public void play(){
        System.out.println("wdnmd");
    }
}
