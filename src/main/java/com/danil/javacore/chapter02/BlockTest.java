package com.danil.javacore.chapter02;

class BlockTest {
    public static void main(String[] args) {
        int x, y = 20;

        for (x = 0; x < 10; x++) {
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            y -= 2;
        }
    }
}
