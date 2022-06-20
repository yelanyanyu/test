package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        List arrayList01 = new ArrayList();
        List arrayList02 = new Vector();
        List arrayList03 = new LinkedList();
//        arrayList01.add(new Book("a","adgf",100));
//        arrayList01.add(new Book("a","adgf",500));
//        arrayList01.add(new Book("a","adgf",10));
//        for (int i = 0; i < arrayList01.size()-1; i++) {
//            for (int j = 0; j < arrayList01.size()-1-i; j++) {
//                if(((Book)arrayList01.get(j)).price>          错在没有保存在临时变量
//                        ((Book)arrayList01.get(j+1)).price){
//                    arrayList01.set(j,arrayList01.get(j+1));
//                    arrayList01.set(j+1,arrayList01.get(j));
//                }
//            }
//        }
        arrayList01.add(new Book("a","adgf",100));
        arrayList01.add(new Book("a","adgf",500));
        arrayList01.add(new Book("a","adgf",10));
        for (int i = 0; i < arrayList01.size()-1; i++) {
            for (int j = 0; j < arrayList01.size()-1-i; j++) {
                Book o1 = (Book) arrayList01.get(j);
                Book o2 = (Book) arrayList01.get(j+1);
                if(o1.price>o2.price){
                    arrayList01.set(j,o2);
                    arrayList01.set(j+1,o1);
                }
            }
        }
        for (Object o :arrayList01) {
            System.out.println(o.toString());
        }

    }
}
