package com.company;

import java.io.*;

public class BufferIO {
    public static final String sourceFileName = "source.txt";
    public static final String destFileName = "dest.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
        PrintWriter write = new PrintWriter(destFileName);
        String s = null;
        int words = 0, lines = 0, chars = 0;
        while ((s = reader.readLine()) != null) {
            lines++;
            String[] ws = s.trim().split("\\s+");
            words += ws.length;
            for (String l : ws) {
                chars += l.length();
                write.println(s.toUpperCase());
            }
            write.println();
            s.toUpperCase();
        }
        reader.close();
        write.close();
        System.out.println(chars);
        System.out.println(words);
        System.out.println(lines);
    }
}