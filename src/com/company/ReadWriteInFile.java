package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;

import static java.lang.System.out;

public class ReadWriteInFile {
    public static final String sourceFileName = "source.txt";

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(sourceFileName, "rw");
        out.println(raf.length());
        raf.seek(10);
        String s = raf.readLine();
        out.println(s);
        raf.seek(raf.length());
        raf.writeUTF("weyugygyuf");
        raf.close();
    }

}
