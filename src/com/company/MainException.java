package com.company;

public class MainException {
    static void d()throws MyExeption{

            throw new MyExeption("hi");

    }

    public static void main(String[] args) {
        try {
            d();
        } catch (MyExeption myExeption) {
            myExeption.printStackTrace();
        }
    }
}
