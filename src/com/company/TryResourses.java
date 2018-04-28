package com.company;

import java.io.*;

public class TryResourses {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream dout =
        new DataOutputStream(new FileOutputStream("Test.dat")))
        {
            dout.writeDouble(98.5);
            dout.writeInt(444);
            dout.writeBoolean(true);
      } catch(FileNotFoundException e) {
            System.out.println("ueruguergreger");
            return;

        } catch (IOException e ){
            System.out.println("IO eriutitu " + e);
        }

        try (DataInputStream din =
        new DataInputStream(new FileInputStream("Test.dat")))
        {
            double d = din.readDouble();
            int i = din.readInt();
            System.out.println("urugerugeugtug");
        } catch(FileNotFoundException e){
            System.out.println("Cannot iueuigug");
            return;
        }catch (IOException e) {
            System.out.println("IO error hguhu " + e);
        }

    }
}
