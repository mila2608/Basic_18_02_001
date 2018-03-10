package com.company;

public abstract class Shape {
    String color = "none";
    public Shape (String color){
        this.color = color;
    }
    public abstract void draw();
    public void m(){
        System.out.println("m");
    }
}
