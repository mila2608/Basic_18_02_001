package com.company;

public class MainPoint {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point = new Point(10, 10);
        Point point1 = new Point(10, 16);
        Point point2 = (Point) point.clone();


        System.out.println(point.hashCode());
        System.out.println(point1.hashCode());
        System.out.println(point1.equals(point2));
        System.out.println(point.getClass() == Point.class);

    }
}
