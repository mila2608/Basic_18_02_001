package com.company;

public class Generics<T> {
    T ob;
    Generics(T o){
        ob = o;
    }
    T getOb(){
        return  ob;
    }
    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }


    public static void main(String[] args) {
        Generics<Integer>  iOb;
        iOb = new Generics<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("v = " + v);
        System.out.println();
}
class TwoGen<T, V>{
        T ob1;
        V ob2;

TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
}
void showTypes(){
    System.out.println("Type of T is " + ob1.getClass().getName());
    System.out.println("Type of V is " + ob2.getClass().getName());
}
}
}