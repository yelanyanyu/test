package com.homework02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("a",1000,
                new Mydate("01","02",2021)));
        employees.add(new Employee("a",10000,
                new Mydate("10","06",2021)));
        employees.add(new Employee("a",2000,
                new Mydate("06","02",2021)));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getName()==o2.getName()){
//                    String year01 =  String.valueOf(o1.getBirthday().getYear());
//                    String year02 =  String.valueOf(o2.getBirthday().getYear());
//                    String str01=year01+o1.getBirthday().getMonth()+o1.getBirthday().getDay();
//                    String str02=year02+o2.getBirthday().getMonth()+o2.getBirthday().getDay();
//                    return str01.compareTo(str02);
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee next = iterator.next();
            System.out.println(next);
        }
    }
}
