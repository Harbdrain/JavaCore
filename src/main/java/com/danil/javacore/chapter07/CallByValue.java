package com.danil.javacore.chapter07;

class Test2 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test2 ob = new Test2();
        int a = 15, b = 20;
        System.out.println("a and b before func call: " + a + ", " + b);
        ob.meth(a, b);
        System.out.println("a and b after func call: " + a + ", " + b);
    }
}
