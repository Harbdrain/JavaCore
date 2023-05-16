package com.danil.javacore.chapter09;

class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();

        if (nif.isNotNegative(10)) {
            System.out.println("10 is negative");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("Unreachable code");
        }
    }
}
