package com.systechafrica.part5.lambdaFunctions;

import java.util.List;

public class LambdaFunctions {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<String> strings = List.of("one", "two", "three", "four", "five");
        integers.forEach(integer -> System.out.println(integer));
        integers.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);

        strings.stream().filter(string -> string.length() > 3).forEach(System.out::println);
        
    }
}
