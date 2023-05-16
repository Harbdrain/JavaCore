package com.danil.javacore.chapter09;

class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback(): " + p);
    }

    void nonInfaceMeth() {
        System.out.println("non-interface method");
    }
}
