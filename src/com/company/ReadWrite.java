package com.company;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadWrite {
    public static void main(String[] args) throws IOException {

        /*InputStream inFile = new FileInputStream("a.txt");
                readFullyByByte(inFile);
        System.out.println("\n\n\n");

        InputStream inURL = new URL("https://www.google.com/").openStream();
                readFullyByByte(inURL);
        System.out.println("\n\n\n");*/

        InputStream inArray = new ByteArrayInputStream((new byte[]{-55,66,-8,44,66, -1}));
        readFullyByByte(inArray);
        System.out.println("\n\n\n");

    }

    public static void readFullyByByte(InputStream in) throws IOException {
        while(true) {
            int oneByte = in.read();
            if(oneByte != -1){
                System.out.println(oneByte);
            } else {
                System.out.println("end");
                break;
            }
        }
    }
}
