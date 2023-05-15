package com.danil.javacore.chapter05;

class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before return");
        if (t) return;
        System.out.println("Unreachable code");
    }
}
