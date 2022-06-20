package com;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        try {
            Register xiaoming1 = new Register("xiaoming",
                    "123456", "1234512@123.com");
            Register ads = new Register("ads", "1233454", "1234512@123.com");
            Register acb = new Register("acb", "123345", "1234512.123.com");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
