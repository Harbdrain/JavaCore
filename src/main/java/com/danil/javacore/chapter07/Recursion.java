package com.danil.javacore.chapter07;

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("fact(3): " + f.fact(3));
        System.out.println("fact(4): " + f.fact(4));
        System.out.println("fact(5): " + f.fact(5));
    }
}
