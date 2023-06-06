package com.danil.javacore.chapter11;

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " get in A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " tried to call B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("In method A.last()");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " get in B.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " tried to call A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("In method B.last()");
    }
}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "Competive thread");
        t.start();
        a.foo(b);
        System.out.println("Back into main thread");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back into competive thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
