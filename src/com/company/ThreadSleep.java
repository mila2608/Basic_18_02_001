package com.company;

public class ThreadSleep implements Runnable{
    String name;
    Thread t;

    ThreadSleep(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("new thread" + t);
        t.start();

    }
    public void run(){
        try {
            for (int i = 5; i >0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
            } catch (InterruptedException e) {
                System.out.println(name + "Interrupt");
            }
            System.out.println(name + "existing");
        }

    }


class Mu {
    public static void main(String[] args) {
        ThreadSleep ob1 = new ThreadSleep("1");
        ThreadSleep ob2 = new ThreadSleep("2");
        ThreadSleep ob3 = new ThreadSleep("3");

        System.out.println("1 is alive" + ob1.t.isAlive());
        System.out.println("2 is alive" + ob2.t.isAlive());
        System.out.println("3 is alive" + ob3.t.isAlive());


    }
}