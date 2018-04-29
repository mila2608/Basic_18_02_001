package com.company;

public class ThreadMyClass2Main {
    public static void main(String[] args) {
        System.out.println(TreadsMyClass.currentThread().getName());

        Runnable a = () ->{
            Thread thread = Thread.currentThread();
            for (int i = 0; i < 10; i++) {
                System.out.println(thread.getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        new Thread(a).start();
        }
    }
