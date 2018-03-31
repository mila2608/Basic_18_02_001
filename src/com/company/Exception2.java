package com.company;

import java.io.IOException;

public class Exception2 {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception("a");
            } finally {
                if (false) {
                    throw new IOException("b");
                }
                System.err.println("c");
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            System.err.println("d");
            System.err.println(ex.getMessage());
        }
    }
}