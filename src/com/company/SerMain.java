package com.company;

import java.io.*;

public class SerMain{
public static void main(String[] args) throws FileNotFoundException {
    Serialization goncharenko = new Serialization("YYU", "Goncharenko", 1, "Y65Rgg6");
    System.out.println(goncharenko);
    File fw = new File("demo.txt");
    try (ObjectOutputStream ost = new ObjectOutputStream(new
            FileOutputStream(fw))) {
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
