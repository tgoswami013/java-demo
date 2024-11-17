package com.tg.learn.generics;

class MyItems1 {
    public <T> T showItem(T item){
        return item;
    }
}

public class MethodsReturnTypes{
    public static void main(String[] args) {
        MyItems1 mi = new MyItems1();

        System.out.println(mi.showItem("Hello World1"));
    }
}
