package com.tg.learn.generics;

class FindGreater{
    public static <T extends Comparable<T>> int countGreaterItems(T[] items, T item) {
        int counter = 0;

        for (T t : items)
            if (t.compareTo(item) > 0)
                ++counter;

        return counter;
    }
}
public class GreaterArrayExample {
    public static void main(String[] args) {
        Integer a[]  = {5, 6,1,2,3};
        System.out.println(FindGreater.countGreaterItems(a, 3));
    }
}