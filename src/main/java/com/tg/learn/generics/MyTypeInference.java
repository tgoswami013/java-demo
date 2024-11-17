package com.tg.learn.generics;

import java.util.ArrayList;
import java.util.List;

class Bucket<T> {
    private T item;

    public T getItem(){
        return this.item;
    }

    public void setItem(T item){
        this.item = item;
    }

    public static <T> void addStore(T t, List<Bucket<T>> list){
        Bucket<T> bucket = new Bucket<>();

        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString()+" has been added to the method");
    }
}

public class MyTypeInference{
    public static void main(String[] args) {
        List<Bucket<String>> list = new ArrayList<>();

        Bucket.addStore("Hello", list);
        // Type Witness
        Bucket.<String>addStore("Hello", list);
    }
}
