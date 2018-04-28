package com.company;

import java.io.*;

public class Serialization implements Serializable {
    protected static String faculty;
    private String name;
    private int id;
    private transient String password;
    private static final long serialVersionID = 1L;

    public Serialization(String nameofFaculty, String name, int id, String password) {
        faculty = nameofFaculty;
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Serialization{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
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

