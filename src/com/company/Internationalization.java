package com.company;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Internationalization {
    public static void main(String[] args) {
        NumberFormat nfGe = NumberFormat.getInstance(Locale.GERMAN);
        double iGe = 0;
        String str = "1.234,5";

        try {
            iGe = nfGe.parse(str).doubleValue();
        } catch (ParseException e) {
            System.err.print("Error position: " + e.getErrorOffset());
          //  e.printStackTrace();
        }
        System.out.println(iGe);

        Date d = new Date();
        Locale[] locales = DateFormat.getAvailableLocales();
        for (Locale loc : locales) {
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
            System.out.println(loc.toString() + "---> " + df.format(d));
        }

    }
}
