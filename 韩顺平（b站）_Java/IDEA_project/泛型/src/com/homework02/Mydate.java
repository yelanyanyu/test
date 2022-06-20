package com.homework02;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Mydate implements Comparable<Mydate> {
    private String month;
    private String day;
    private int year;

    public Mydate() {
    }

    public Mydate(String month, String day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Mydate o) {
        String year01 = String.valueOf(year);
        String year02 = String.valueOf(o.getYear());
        String str01 = year01 + month + day;
        String str02 = year02 + o.getMonth() + o.getDay();
        return str01.compareTo(str02);
    }
}
