package com.company;

import java.util.EnumSet;

enum Facility {
    YYTI, HGHFF, KKJHU, OIUJY;
}

public class EnumCollection {
    public static void main(String[] args) {
        EnumSet<Facility> set1 = EnumSet.range(Facility.HGHFF, Facility.KKJHU);
        EnumSet<Facility> set2 = EnumSet.complementOf(set1);
        System.out.println(set1);
        System.out.println(set2);

    }
}
