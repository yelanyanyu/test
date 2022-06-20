package com;

/*
  @author yelanyanyu@zjxu.edu.cn  
  @verson 1.0
*/
public class Test {
    public static void main(String[] args) {
        new A().new B().show();
    }
}

class A{
    private final String name="qwe";
    class B{
        private final String name ="zqs";
        public void show(){
            System.out.println(name);
            System.out.println(A.this.name);
        }
    }

}
