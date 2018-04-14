package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Collection1 {
    static Stream<String> set2 = Arrays.stream(new String[] {"A", "B", "H", "Y"});

    static TreeSet<String> set1 = new TreeSet<>();
      static {
          set1.add("B");
          set1.add("A");
          set1.add("1");
          set1.add("D");
          set1.add("0");
          System.out.println(set1);

      }
    static HashSet<String> set = new HashSet<>();
    static {
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("D");
        set.add("0");
        System.out.println(set.hashCode());
set.forEach(s-> System.out.print(s.hashCode()+" "));
    }
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        hs.add(null);
        System.out.println(hs);
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Init sixe " + al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size all other addition " + al.size());
        System.out.println(al);
        al.remove("F");
        al.remove(2);
        System.out.println(al.size());
        System.out.println(al);

        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Init sixe " + ll.size());
        ll.add("C");
        ll.add("A");
        ll.add("E");
        ll.add("B");
        ll.add("D");
        ll.add("F");
        ll.addFirst("AA");
        ll.addLast("Z");
        ll.add(1, "A2");
        System.out.println("Size all other addition " + ll.size());
        System.out.println(ll);
        ll.remove("F");
        ll.remove(2);
        System.out.println(ll.size());
        System.out.println(ll);

    }











}
