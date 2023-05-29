package com.danil.javacore.chapter20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataIODemo {
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(100);
            dout.writeBoolean(true);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("d: " + d);
            System.out.println("i: " + i);
            System.out.println("b: " + b);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
