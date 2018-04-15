package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Collection2 {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<String>();
        Deque<String> queue = new ArrayDeque<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        while (!stack.isEmpty())
            System.out.println(stack.pop() + " ");
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        while (!queue.isEmpty())
            System.out.println(queue.remove() + " ");

        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");
        System.out.println("uyyttytty");
        while (queue1.size()>0){
            System.out.println(queue1.remove() + " ");
        }

    }
}
