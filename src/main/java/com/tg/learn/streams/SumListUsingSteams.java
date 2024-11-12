package com.tg.learn.streams;

import java.util.List;

public class SumListUsingSteams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 1, 3, 4, 6, 5);
        int sum = numbers
                    .stream()
                    .reduce(0, Integer::sum);
//                    .reduce(0, (x, y) -> x + y);

        System.out.println(sum);

    }

}
