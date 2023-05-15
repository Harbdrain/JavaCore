package com.danil.javacore.chapter07;

class PassObjRe {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        System.out.println("a and b before func call: " + ob.a + ", " + ob.b);
        ob.meth(ob);
        System.out.println("a and b after func call: " + ob.a + ", " + ob.b);
    }
}
