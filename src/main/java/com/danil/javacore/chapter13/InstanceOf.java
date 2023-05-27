package com.danil.javacore.chapter13;

class A {

}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) {
            System.out.println("a instanceof A");
        }
        if (b instanceof B) {
            System.out.println("b instanceof B");
        }
        if (c instanceof C) {
            System.out.println("c instanceof C");
        }
        if (c instanceof A) {
            System.out.println("c instanceof A");
        }

        if (a instanceof C) {
            System.out.println("a instanceof C");
        }
        System.out.println();

        A ob;
        ob = d;
        System.out.println("ob -> d");
        if (ob instanceof D) {
            System.out.println("ob instanceof D");
        }
        System.out.println();

        ob = c;
        System.out.println("ob -> c");
        if (ob instanceof D) {
            System.out.println("ob instanceof D");
        } else {
            System.out.println("ob not instanceof D");
        }
        System.out.println();

        if (a instanceof Object) {
            System.out.println("a instanceof Object");
        }
        if (b instanceof Object) {
            System.out.println("b instanceof Object");
        }
        if (c instanceof Object) {
            System.out.println("c instanceof Object");
        }
        if (d instanceof Object) {
            System.out.println("d instanceof Object");
        }
    }
}
