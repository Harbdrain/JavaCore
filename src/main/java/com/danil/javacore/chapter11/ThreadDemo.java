package com.danil.javacore.chapter11;

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("created sub-thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("sub-thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Sub-Thread stopped");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
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
