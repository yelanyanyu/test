package com._01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("01",new Employee("zhangsan",1,179999));
        hashMap.put("02",new Employee("lisi",2,18000));
        hashMap.put("03",new Employee("zhangsan",1,18001));


        System.out.println("======遍历方式1：增强for=====");

        Set keySet = hashMap.keySet();
        for (Object key:keySet) {
            Employee employee = (Employee) hashMap.get(key);
            if(employee.sal>18000){
                System.out.println(employee.toString());
            }
        }

        System.out.println("======遍历方式2：迭代器======");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Employee employee = (Employee) (hashMap.get(next));
            Employee next1 = employee;
            if (next1.sal>18000) {
                System.out.println(hashMap.get(next));
            }
        }
    }
}
