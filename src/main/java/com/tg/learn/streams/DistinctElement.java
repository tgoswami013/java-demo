package com.tg.learn.streams;

import java.util.List;

public class DistinctElement {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7);

        numbers.stream().distinct().forEach(System.out::println);
    }
}
