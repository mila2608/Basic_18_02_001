package com.company;

import java.util.Comparator;

public class GirlComparatorMain implements Comparator<Collection3.Girl1> {
    @Override
    public int compare(Collection3.Girl1 o1, Collection3.Girl1 o2) {
        return o1.name.compareTo(o2.name);
    }
}
