package com.danil.javacore.chapter02;

class Example2 {
    public static void main(String[] args) {
        int num; // num is declared, but not defined.
        num = 10; // num is defined.
        System.out.println("Num: " + num);
        num *= 2;
        System.out.print("Num * 2 = ");
        System.out.println(num);
    }
}
