package com.company;

import java.util.Random;

public class Exceptions {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        try {
            c = a / b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(" hi");
        a = 0;
        Random r = new Random();
        /*for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                // e.printStackTrace();
                System.out.println("delenie na nol");
                a = 0;
            }
        }*/
            System.out.println("a = " + a);
            int a1;
            try {
                a1 = args.length;
                int b1 = 42 / a;
                int[] c1 = new int[a];
                c1[a] = 666;
            } catch (ArithmeticException e) {
                //   e.printStackTrace();
                System.out.println("delenie na nol" + e);

            } catch (ArrayIndexOutOfBoundsException e) {

                e.printStackTrace();
            }
            System.out.println("posle bloka try catch");
        }

    }
