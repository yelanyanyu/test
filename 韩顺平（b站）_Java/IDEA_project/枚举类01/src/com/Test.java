package com;
/*
  @author yelanyanyu@zjxu.edu.cn  
  @verson 1.0
*/

public class Test {
    public static void main(String[] args) {
        Enumeration_01 [] enumeration_01 = Enumeration_01.values();
        for(Enumeration_01 value : enumeration_01){
            System.out.println(value);
        }
    }
}
