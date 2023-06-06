package com.danil.javacore.chapter28;

import java.util.concurrent.Semaphore;

class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}

class Shared {
    static int count = 0;
}

class IncThread implements Runnable {
    String name;
    Semaphore sem;

    IncThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Started thread " + name);

        try {
            System.out.println("Thread " + name + " waiting for access");
            sem.acquire();
            System.out.println("Thread " + name + " got access");

            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(10);
            }

            System.out.println("Thread " + name + " released access");
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DecThread implements Runnable {
    String name;
    Semaphore sem;

    DecThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Started thread " + name);

        try {
            System.out.println("Thread " + name + " waiting for access");
            sem.acquire();
            System.out.println("Thread " + name + " got access");

            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(10);
            }

            System.out.println("Thread " + name + " released access");
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
