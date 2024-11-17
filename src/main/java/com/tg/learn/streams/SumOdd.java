package com.tg.learn.streams;

import java.util.List;

public class SumOdd {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream().filter(x -> x % 2 == 1).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
