package com.danil.javacore.chapter07;

class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println(outer_x);
        }
    }
}
