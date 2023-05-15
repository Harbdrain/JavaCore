package com.danil.javacore.chapter07;

class AssertTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();
        ob.a = 10;
        ob.b = 20;
        // ob.c = 30; // Error

        ob.setC(30);

        System.out.println("ob.a: " + ob.a);
        System.out.println("ob.b: " + ob.b);
        System.out.println("ob.c: " + ob.getC());
    }
}
