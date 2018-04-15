package com.company;

import java.util.Comparator;
import java.util.TreeSet;

public class Collection3 {
    public static void main(String[] args) {
        Comparator<Girl1> nameComparator = (a1, a2) -> a1.name.compareTo(a2.name);
        TreeSet<Girl1> girl1s = new TreeSet<>(new GirlComparatorMain());
        TreeSet<Girl1> girl1s2 = new TreeSet<Girl1>((a1, a2) -> a1.name.compareTo(a2.name));
        girl1s.add(new Girl1("Ira", 33));
        girl1s.add(new Girl1("Anna", 23));
        girl1s.add(new Girl1("Ket", 15));
        girl1s.add(new Girl1("Jane", 28));
        System.out.println(girl1s);
    }

    public static class Girl1 implements Comparable<Girl1> {
        String name;
        int age;

        public Girl1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Girl1{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Girl1 o) {
            return age - o.age;
        }


    }
}


