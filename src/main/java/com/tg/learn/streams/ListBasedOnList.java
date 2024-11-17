package com.tg.learn.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ListBasedOnList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2 , 4, 1 , 3, 6, 5);

        List<Integer> doubledNumbers = doubleList(numbers);
        System.out.println(doubledNumbers);
    }

    private static int sum(int aggregator, int nextNumber){
        System.out.println(aggregator + " " + nextNumber);
        return aggregator + nextNumber;
    }

    private static List<Integer> doubleList(List<Integer> numbers){
        return
                numbers
                        .stream()
                        .map(number -> number * number)
                        .collect(Collectors.toList());
    }
}
