package com.danil.javacore.chapter09;

class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("callback(): p*p = " + (p * p));
    }
}
