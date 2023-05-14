package com.danil.javacore.chapter03;

class Scope {
    public static void main(String[] args) {
        int x;

        x = 10;
        if (x == 10) {
            int y = 20;

            System.out.println("x: " + x);
            System.out.println("y: " + y);
            x = y * 2;
        }

        // y = 100; // ERROR

        System.out.println("x: " + x);
    }
}
