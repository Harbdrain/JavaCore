package com.danil.javacore.chapter28;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicDemo {
    public static void main(String[] args) {
        new AtomicThread("A");
        new AtomicThread("B");
        new AtomicThread("C");
    }
}

class Shared2 {
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomicThread implements Runnable {
    String name;

    public AtomicThread(String name) {
        this.name = name;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " started");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread " + name + " got: " + Shared2.ai.getAndSet(i));
        }
    }
}
