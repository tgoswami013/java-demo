package com.tg.learn.generics;

class Store<T> {
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}

public class SingleType{
    public static void main(String[] args) {
        Store<String> store = new Store<>();
        store.setItem("Hello");
        System.out.println(store.getItem());

        Store<Integer> store1 = new Store<>();
        store1.setItem(10);
        System.out.println(store1.getItem());
    }
}
