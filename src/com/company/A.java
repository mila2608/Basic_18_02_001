package com.company;

public interface A {
    //  по умолчанию статик паблик, константа
    int a = 10;

    static void m(){
        System.out.println("static");
    }
    void m1();

    default void m2(){
        System.out.println("default");
    }
}
