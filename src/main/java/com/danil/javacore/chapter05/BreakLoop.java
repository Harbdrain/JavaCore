package com.danil.javacore.chapter05;

class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Done");
    }
}
