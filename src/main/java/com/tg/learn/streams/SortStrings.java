package com.tg.learn.streams;

import java.util.Comparator;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> myStrings = List.of("Ram", "Sham", "Mohan", "Krishna");

        System.out.println("Sort in Ascending Order");
        myStrings.stream().sorted().distinct().forEach(System.out::println);

        System.out.println("Sort in Ascending Order");
        myStrings.stream().sorted(Comparator.naturalOrder()).distinct().forEach(System.out::println);

        System.out.println("Sort in Reverse Order");
        myStrings.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
    }
}
