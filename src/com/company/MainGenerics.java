package com.company;

public class MainGenerics {
    public static void main(String[] args) {
        Girl girl1 = new Girl("Ira", 33);
        Girl girl2 = new Girl("Anna", 23);
        Girl girl3 = new Girl("Ket", 15);
        Girl girl4 = new Girl("Jane", 28);
        Girl girl[]= {girl1, girl2,girl3,girl4};
        GenericsInterface <Girl> girlOb = new GenericsInterface<Girl>(girl);
        System.out.println(girlOb.max());
        System.out.println(girlOb.min());
    }
}
