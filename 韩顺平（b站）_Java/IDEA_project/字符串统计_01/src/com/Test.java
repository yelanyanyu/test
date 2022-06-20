package com;

import java.util.Scanner;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        statistic(s);
    }
    public static void statistic(String s){
        int count_lower=0;
        int count_upper=0;
        int count_digit=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)<='z'&&s.charAt(i)>='a'){
                count_lower++;
            }else if(s.charAt(i)<='Z'&&s.charAt(i)>='A'){
                count_upper++;
            }else if(s.charAt(i)<='9'&&s.charAt(i)>='0'){
                count_digit++;
            }else {}
        }
        System.out.println("小写字母个数为 "+count_lower+
                " 大写字母个数为 "+count_upper+
                " 数字个数为 "+count_digit
        );
    }
}
