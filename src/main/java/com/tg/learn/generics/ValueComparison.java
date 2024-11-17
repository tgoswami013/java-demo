package com.tg.learn.generics;

class Compare {

    public <T> void checkEquality(T t1, T t2) {
        System.out.println(t1.equals(t2));
    }
}
public class ValueComparison {
    public static void main(String[] args) {
        Compare c = new Compare();

        c.checkEquality(10, 20);
        c.checkEquality(10, 10);
        c.checkEquality(10.5, 20.5);
        c.checkEquality(10.5, 10.5);
        c.checkEquality("HELLO", "hello");
        c.checkEquality("HELLO", "HELLO");

    }
}
