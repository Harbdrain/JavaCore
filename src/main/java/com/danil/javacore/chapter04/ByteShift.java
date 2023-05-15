package com.danil.javacore.chapter04;

class ByteShift {
    public static void main(String[] args) {
        byte a = 64; // 0b0100_0000
        int b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("a: " + a);
        System.out.println("i: " + i);
        System.out.println("b: " + b);
    }
}
