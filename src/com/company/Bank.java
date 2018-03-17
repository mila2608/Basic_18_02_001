package com.company;

public class Bank {
    String title;

    public Bank(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "title='" + title + '\'' +
                '}';
    }

    public class Account {
        int number;
        int balance;

        public Account(int number, int balance) {
            this.number = number;
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }

    }

}
