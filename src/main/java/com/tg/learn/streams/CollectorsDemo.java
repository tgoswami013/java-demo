package com.tg.learn.streams;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 3, 5, 4, 6, 7);

        List<Integer> squaredNumbers = squareList(numbers);

        List<Integer> evenNumberOnly = numbers
                .stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumberOnly);
    }

    public static List<Integer> squareList(List<Integer> numbers){
        return numbers.stream().map(x -> x * x).toList();
    }
}
