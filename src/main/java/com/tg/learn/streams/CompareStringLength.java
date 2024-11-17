package com.tg.learn.streams;

import java.util.Comparator;
import java.util.List;

public class CompareStringLength {
    public static void main(String[] args) {
        List<String> myStrings = List.of("Ram", "Sham", "Krishna", "Mohan");

        myStrings.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
    }
}
