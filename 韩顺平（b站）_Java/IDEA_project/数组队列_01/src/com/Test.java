package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("d1",1);
        Dog dog1 = new Dog("d2",2);
        Dog dog2 = new Dog("d3",3);
        List arrayList = new ArrayList();
        arrayList.add(dog);
        arrayList.add(dog1);
        arrayList.add(dog2);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.toString());
        }
        for (Object obj :arrayList) {
            System.out.println(obj.toString());
        }

    }
}
