package com.tg.learn.generics;

class MyHashTable<K, V>{

    private K key;
    private V value;

    public MyHashTable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return  "Key: " + key + ", Value: " + value;
    }
}

public class MultipleTypes {
    public static void main(String[] args) {
        MyHashTable<String, Integer> myHash = new MyHashTable<>("Hello", 3);
        System.out.println(myHash);
    }
}


