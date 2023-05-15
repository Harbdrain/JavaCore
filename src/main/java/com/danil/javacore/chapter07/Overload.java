package com.danil.javacore.chapter07;

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        ob.test(123.4);
    }
}
