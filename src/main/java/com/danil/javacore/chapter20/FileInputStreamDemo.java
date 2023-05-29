package com.danil.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try (FileInputStream f = new FileInputStream(
                "src/main/java/com/danil/javacore/chapter20/FileInputStreamDemo.java")) {
            System.out.println("available bytes: " + (size = f.available()));
            int n = size / 40;
            System.out.println("first " + n + " bytes: ");

            for (int i = 0; i < n; i++) {
                System.out.println((char) f.read());
            }

            System.out.println("\nAvailable bytes: " + f.available());
            byte[] b = new byte[n];
            if (f.read(b) != n) {
                System.err.println("Cannot read " + n + "bytes");
            }

            System.out.println(new String(b, 0, n));
            System.out.println("\nAvailable bytes: " + (size = f.available()));
            System.out.println("Skip half of available bytes");
            f.skip(size / 2);
            System.out.println("\nAvailable bytes: " + (f.available()));

            System.out.println("reading n/2 bytes");

            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.err.println("Cannot read n/2 bytes");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nAvailable bytes: " + (f.available()));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
