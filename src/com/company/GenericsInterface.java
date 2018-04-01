package com.company;

public class GenericsInterface <T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    GenericsInterface(T[] o) {vals = o;}

    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length ; i++) {
            if(vals[i].compareTo(v) < 0)
                v = vals[i];
        }
        return v;
    }

    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length ; i++) {
            if(vals[i].compareTo(v) > 0)
                v = vals[i];
        }
        return v;
    }
}
