package com.company;

public class Test_Static {

    public static int count = 0;
    static int getCountInstance(){
        return count;
    }
    private String color = "none";
    public  Test_Static (String color){
        this.color = color;
        count++;
    }
    protected void finalize(){
        System.out.println("ASD");
        count--;

    }
}
