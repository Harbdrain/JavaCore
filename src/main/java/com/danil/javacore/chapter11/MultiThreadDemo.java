package com.danil.javacore.chapter11;

class NewThread3 implements Runnable {
    String name;
    Thread t;

    NewThread3(String name) {
        this.name = name;
        t = new Thread(this, this.name);
        System.out.println("new thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name + " stopped");
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread3("First");
        new NewThread3("Second");
        new NewThread3("Third");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
