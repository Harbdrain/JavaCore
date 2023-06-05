package com.danil.javacore.chapter11;

class NewThread2 extends Thread {
    NewThread2() {
        super("Demo thread");
        System.out.println("sub-thread: " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("sub-thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Sub-Thread stopped");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Main Thread stopped");
    }
}
