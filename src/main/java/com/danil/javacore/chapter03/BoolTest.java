package com.danil.javacore.chapter03;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b: " + b);
        b = true;
        System.out.println("b: " + b);

        if (b) {
            System.out.println("Inside if statement.");
        }
        b = false;
        if (b) {
            System.out.println("Unreachable code.");
        }

        System.out.println("10 > 9 equals: " + (10 > 9));
    }
}
