package com.EcmDef;

public class Main {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b= Integer.parseInt(args[1]);
            System.out.println("结果为"+cal(a,b));
        } catch (NumberFormatException e) {
            System.out.println("输入的数不是整数");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("输入的变量个数不对");
        }catch (ArithmeticException e){
            throw new ArithmeticException("被除数为0");
        }
        System.out.println("语句块外被执行");
    }
    public static double cal(int a,int b) throws ArithmeticException{
        return 1.0*a/b;
    }
}
