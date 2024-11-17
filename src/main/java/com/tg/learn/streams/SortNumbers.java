package com.tg.learn.streams;

import java.util.List;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 3, 2, 5, 4);

//        numbers.stream().sorted().forEach(System.out:: println);
        numbers.stream().sorted().distinct().forEach(System.out:: println);

    }
}
