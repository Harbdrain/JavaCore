package com.danil.javacore.chapter03;

class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.132;

        System.out.println("Converting int into byte.");
        b = (byte) i;
        System.out.println("i: " + i);
        System.out.println("b: " + b);

        System.out.println("\nConverting double into int.");
        i = (int) d;
        System.out.println("d: " + d);
        System.out.println("i: " + i);


        System.out.println("\nConverting double into byte.");
        b = (byte) d;
        System.out.println("d: " + d);
        System.out.println("b: " + b);
    }
}
