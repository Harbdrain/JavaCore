package com.danil.javacore.chapter04;

class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("abs(10): " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("abs(-10): " + k);
    }
}
