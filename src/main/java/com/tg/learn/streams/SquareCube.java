package com.tg.learn.streams;

import javax.print.DocFlavor;
import java.util.List;

public class SquareCube {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int cube = numbers.stream().map(x -> x * x * x).reduce(0, Integer::sum);
        System.out.println(cube);
    }
}
