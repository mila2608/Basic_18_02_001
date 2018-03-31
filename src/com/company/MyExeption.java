package com.company;

public class MyExeption extends Exception{
    public MyExeption(String message) {
        super(message);
    }
    public void m(){
        System.out.println("Hi from MyException");
    }
}
