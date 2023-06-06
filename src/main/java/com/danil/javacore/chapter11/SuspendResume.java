package com.danil.javacore.chapter11;

class NewThread4 implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread4(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("new thread: " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

class SuspendResume {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("First");
        NewThread4 ob2 = new NewThread4("Second");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("First thread suspended");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("First thread resumed");

            ob2.mysuspend();
            System.out.println("Second thread suspended");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Second thread resumed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Waiting for threads stop");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread stop");
    }
}
