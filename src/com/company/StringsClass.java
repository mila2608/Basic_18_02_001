package com.company;

import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringsClass {
    public static void main(String[] args) {
        String s = "000000000023234234234-iuu igu gu gu sdsdv sfs 57474747";
        String str = new String("gfuyeryurgy");
        char s2[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s3 = new String(s2);
        String result = new String(s2, 2, 3);
        System.out.println(result);
        System.out.println(s.charAt(1));
        char buf[] = new char[6];
        s.getChars(4, 10, buf, 0);
        System.out.println(buf);
        String s4 = new String("000002974238-iuu igu gu gu sdsdv sfs 325235");
        //      System.out.println(s == s4.intern());
        System.out.println(s.endsWith("sfs"));
        String str3 = " Igu";
        System.out.println(s.regionMatches(false, 3, str3, 0, 3));
        System.out.println(s.substring(4, 10));
        System.out.println(s.substring(3));
        System.out.println(s.indexOf("u", 4));
        System.out.println("uytuyt".concat(" hgghgh"));
        System.out.println("Hello".replace('l', 'w'));
        System.out.println("Hello".toLowerCase());
        System.out.println("Hello".toUpperCase());
        System.out.println("   Hello   ".trim());
        //    String format(Locale locale, String format, Object... args)
        String output = String.format("%s=%d", "joe", 35);
        System.out.printf("My name is: %s%n", "joe");
        //   int i = Integer.parseInt(s.replace("[\\D]", ""));
        //    System.out.println(i);
        //   System.out.println(s.replace("^0*",""));
        StringBuffer sb = new StringBuffer("Hello wrqwrwewgregretertretrtrwtwt");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.deleteCharAt(0));
        System.out.println(String.join(":", "foo", "bar"));
        String foo = new String("foobar:foo:bar");
        System.out.println(foo.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted()
                .collect(Collectors.joining()));
        System.out.println(Pattern.compile(":")
                .splitAsStream("foobar:foo:bar")
                .filter(e -> e.contains("bar"))
                .sorted()
                .collect(Collectors.joining(";")));

        Locale asDefault = Locale.getDefault();
        System.out.println(asDefault);
        System.out.println(new Date());
        Locale.setDefault(Locale.CHINESE);
        System.out.println(new Date());



    }

        public static boolean test (String testString){
            Pattern p = Pattern.compile(".+\\.(com)");
            Matcher m = p.matcher(testString);
            return m.matches();
    }


    }

