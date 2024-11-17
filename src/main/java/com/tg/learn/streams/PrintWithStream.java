package com.tg.learn.streams;

import java.util.List;

public class PrintWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 3, 5, 6, 8, 10);

        numbers
                .stream()
                .forEach(System.out::println);
    }
}
