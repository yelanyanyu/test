package com.homework01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        News news01 = new News("1asdgasdgasdgasdgasdgasg");
        News news02 = new News("2");
        ArrayList<News> arrayList = new ArrayList<>();
        arrayList.add(news01);
        arrayList.add(news02);
        Stack<News> stack = new Stack<>();
        Iterator<News> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            News next =  iterator.next();
            if (next.getTitle().length()>15) {
                String str = next.getTitle().substring(0,15)+"...";
                next.setTitle(str);
                stack.push(next);
                continue;
            }
            stack.push(next);
        }
        for (int i = 0; i < stack.size()+1; i++) {      //为什么要size()+1?
            System.out.println(stack.pop());
        }


    }
}
