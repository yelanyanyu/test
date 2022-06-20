package com;

/*
  @author yelanyanyu@zjxu.edu.cn  
  @verson 1.0
*/
public enum Enumeration_01 {
    MONDAY("星期一"),TUSEDAY("星期二");
    private String det;
    Enumeration_01(String det) {
        this.det = det;
    }

    @Override
    public String toString() {
        return det;
    }
}
