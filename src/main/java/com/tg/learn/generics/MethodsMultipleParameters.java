package com.tg.learn.generics;

class MyItems2 {
    public <K, V> void showItem(K key, V value){
        System.out.println("Key is: "+key.toString());
        System.out.println("Value is: "+value.toString());

    }
}

public class MethodsMultipleParameters {
    public static void main(String[] args) {
        MyItems2 mi = new MyItems2();

        mi.showItem("Hello World", 334);

    }
}