package com;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Book {
    public String name;
    public String author;
    public double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
