package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Predicate_Test {
    public static void main(String[] args) {
        // arg - lokal variable in method
        Predicate<String>nullCheck = arg->arg != null;
        Predicate<String>emptyCheck = arg ->arg.length()>0;
        Predicate<String>nullAndEmptyCheck = nullCheck.and(emptyCheck);
        String helloStr = "hello";
        System.out.println(nullAndEmptyCheck.test(helloStr));
        String nullStr = null;
        System.out.println(nullAndEmptyCheck.test(nullStr));
        // Functional Interface
        Arrays.stream("4,-9,34,23".split(","))
                .map(Integer::parseInt)
                .map(i->(i<0)?-i:i)
                .forEach(System.out::println);
        // Supplier
        Random r = new Random(10);
        Stream.generate(r::nextInt)
                .limit(2)
                .forEach(System.out::println);

    }
}
