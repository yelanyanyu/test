package com.homework03;

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
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("jack", 650);
        hashMap.put("tom", 1200);
        hashMap.put("smith", 2900);
        hashMap.put("jack", 2600);
        Set<String> keySet = hashMap.keySet();

        System.out.println("====迭代方式1=====");
        for (String key : keySet) {
            Integer value = hashMap.get(key);
            hashMap.put(key, value + 100);
        }
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next + "-" + hashMap.get(next));
        }

        System.out.println("====迭代方式2====");
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String,Integer> entry : entries) {
            String key = entry.getKey();
//            String key = (String) entry.getKey();
            System.out.println(key + "-" + hashMap.get(key));
        }

    }
}
