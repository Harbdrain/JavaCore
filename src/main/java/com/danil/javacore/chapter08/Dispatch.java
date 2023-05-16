package com.danil.javacore.chapter08;

class Dispatch {
    public static void main(String[] args) {
        A5 a = new A5();
        B5 b = new B5();
        C5 c = new C5();

        A5 r;

        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();
    }
}
