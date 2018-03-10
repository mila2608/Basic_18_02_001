package com.company;

public class Test_Static_Main {
    public static void main(String[] args) {
        Test_Static ts = new Test_Static("red");
        System.out.println(ts);
        System.out.println(Test_Static.getCountInstance());
        System.out.println(Test_Static.count);

    }
}
