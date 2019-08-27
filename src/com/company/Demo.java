package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(10,20,30);
        Optional<Integer> sum = stream.reduce((x,y) -> x + y);
        sum.ifPresent(System.out::println);
        stream.distinct()
                .sorted()
                .map(String::valueOf)
                .peek(s -> System.out.println(s.getClass().toString()))
                .forEach(System.out::println);

        List<Integer> integers = Arrays.asList(4,5,9,8,7,4,5,6,3,2,1,7,8,9,6,35,0);
        Optional<Integer> i = integers.stream().filter(s -> s ==35).findFirst();
        integers.stream().filter(s -> s>5).sorted().forEach(System.out::println);
        i.ifPresent(System.out::println);
    }
}
