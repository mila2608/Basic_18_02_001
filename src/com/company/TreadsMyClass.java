package com.company;

public class TreadsMyClass extends Thread{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(thread.getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
