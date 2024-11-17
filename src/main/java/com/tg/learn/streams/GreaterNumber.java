package com.tg.learn.streams;

import java.util.List;

public class GreaterNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 5, 14, 3, 2 );
//        System.out.println(numbers.stream().reduce(0, (x,y) -> x> y ? x : y));
        System.out.println(numbers.stream().reduce(Integer.MIN_VALUE, (x,y) -> x> y ? x : y));
    }
}
