package com.danil.javacore.chapter07;

class OverloadDemo {
    void test() {
        System.out.println("No args");
    }

    void test(int a) {
        System.out.println("int a: " + a);
    }

    void test(int a, int b) {
        System.out.println("int a: " + a);
        System.out.println("int b: " + b);
    }

    void test(double a) {
        System.out.println("double a: " + a);
    }
}
