package com.tg.learn.generics;

class MyItems3{
    public <T> void showItems(T[] items){
        for(T item: items)
            System.out.println(item);
    }
}

public class ArrayTypes {
    public static void main(String[] args) {
        MyItems3 my = new MyItems3();
        Integer a[]  = {1,2,3};
        String s[] = {"hello", "world"};

        my.showItems(a);
        my.showItems(s);
    }
}
