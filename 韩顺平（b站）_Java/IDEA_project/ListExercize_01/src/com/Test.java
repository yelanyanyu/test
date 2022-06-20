package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        List alist = new ArrayList();
        alist.add("a");
        alist.add("b");
        alist.add("c");
        alist.add("d");
        alist.add("e");
        alist.add("f");
        alist.add("g");
        alist.add("h");
        alist.add("i");
        alist.add("g");
        alist.add("k");
        alist.add(2,"zqs");
        System.out.println(alist);
        System.out.println("第五个元素是："+alist.get(5));
        alist.remove(6);
        System.out.println("删除后："+alist);
        alist.set(7,"wdnmd");
        System.out.println("修改后："+alist);
        Iterator iterator = alist.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.toString());
        }
    }
}
