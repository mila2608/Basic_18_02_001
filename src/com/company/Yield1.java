package com.company;

public class Yield1 {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println("start 1");
                Thread.yield();
                System.out.println("end 1");
            }
        }.start();

        new Thread(){
            public void run(){
                System.out.println("start 2");
                Thread.yield();
                System.out.println("end 2");
            }
        }.start();
        new Thread(){
            public void run(){
                System.out.println("start 3");
                Thread.yield();
                System.out.println("end 3");
            }
        }.start();
    }
}
