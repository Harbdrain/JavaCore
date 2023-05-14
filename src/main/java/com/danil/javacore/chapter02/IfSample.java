package com.danil.javacore.chapter02;

class IfSample {
    public static void main(String[] args) {
        int x = 10, y = 20;

        if (x < y) {
            System.out.println("x less than y.");
        }

        x *= 2;
        if (x == y) {
            System.out.println("x equals y.");
        }

        x *= 2;
        if (x > y) {
            System.out.println("x greater than y.");
        }

        if (x == y) {
            System.out.println("Unreachable code.");
        }
    }
}
