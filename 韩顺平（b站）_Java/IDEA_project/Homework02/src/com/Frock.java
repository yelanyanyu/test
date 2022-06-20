package com;

/*
  @author yelanyanyu@zjxu.edu.cn  
  @version 1.0
*/
public class Frock {
    private static int currentNum=100000;
    int serialNumber ;

    public int getSerialNumber() {
        this.serialNumber= getNextNum();
        return serialNumber;
    }

    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }
}
