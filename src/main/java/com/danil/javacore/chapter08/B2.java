package com.danil.javacore.chapter08;

class B2 extends A2 {
    int i;

    B2(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
            System.out.println("super.i:" + super.i);
            System.out.println("i:" + i);
    }
}
