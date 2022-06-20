package com.homework02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Car car01 = new Car("宝马",1000000);
        Car car02 = new Car("法拉利",10000000);
        Car car03 = new Car("法拉啥地方",1800000);
        Car car04 = new Car("法拉asd",10000900);
        Car car05 = new Car("法电风扇杆",100000);
        Car car06 = new Car("阿阿萨德刚拉利",1000000);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car01);
        cars.add(car02);

        System.out.println("=====遍历=====");
        //遍历
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("========");
        for (Car car :cars) {
            System.out.println(car);
        }

        System.out.println("=====删除====");
        //删除
        cars.remove(0);
        iterator=cars.iterator();
        while (iterator.hasNext()) {
            Car next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("=====添加多个元素====");
        //添加多个元素
        ArrayList<Car> cars_temp01 = new ArrayList<>();
        cars_temp01.add(car03);
        cars_temp01.add(car04);
        cars_temp01.add(car05);
        cars_temp01.add(car06);
        cars.addAll(cars_temp01);
        for (Car car :cars) {
            System.out.println(car);
        }

        System.out.println("=======删除多个元素=======");
        //删除多个元素
        ArrayList<Car> cars_temp02 = new ArrayList<>();
        cars_temp02.add(car03);
        cars_temp02.add(car04);
        cars_temp02.add(car05);
        cars.removeAll(cars_temp02);

        for (Car car :cars) {
            System.out.println(car);
        }

    }
}
