package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collections4 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("red", "green", "blue", "red"));
        Collections.sort(list1);
        System.out.println(list1);
        List<String> list2 = new ArrayList<>(Arrays.asList("red", "green", "blue"));
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);
        Collections.shuffle(list2);
        System.out.println(list2);
     //   Collections.fill(list1, "black");
        System.out.println(list1);
        System.out.println(Collections.disjoint(list1, list2));
        System.out.println(Collections.frequency(list1, "black"));

list1
        .stream()
        .filter(s -> s.startsWith("r"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);

Arrays.asList("a1", "a2", "a3")
        .stream()
        .findFirst()
        .ifPresent(System.out::println);

        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);
        IntStream.range(1, 4)
                .forEach(System.out::println);

        IntStream.range(1,4)
                .mapToObj(i-> "a" + i)
                .forEach(System.out::println);

      //  Stream.generate(())

    }
}
