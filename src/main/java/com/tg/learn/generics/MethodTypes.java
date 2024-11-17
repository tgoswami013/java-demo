package com.tg.learn.generics;

class MyItems {
    public <T> void showItem(T item){
        System.out.println("Item is: "+item.toString());
    }
}

public class MethodTypes{
    public static void main(String[] args) {
        MyItems mi = new MyItems();

        mi.showItem("Hello World");
        mi.showItem(34);
        mi.showItem(34.5);
    }
}
