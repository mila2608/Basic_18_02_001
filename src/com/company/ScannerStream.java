package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerStream {
    static String filename = "scan.txt";
    public static void scanFile() {
        try {
            FileReader fr = new FileReader(filename);
            Scanner scan = new Scanner(fr);

            while (scan.hasNext()){
                if (scan.hasNextInt())
                    System.out.println(scan.nextInt() + ": int");
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        ScannerStream.scanFile();
    }
}
