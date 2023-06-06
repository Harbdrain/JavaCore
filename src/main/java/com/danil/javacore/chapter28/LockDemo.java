package com.danil.javacore.chapter28;

import java.util.concurrent.locks.ReentrantLock;

class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}

class LockThread implements Runnable {
    ReentrantLock lock;
    String name;

    public LockThread(ReentrantLock lock, String name) {
        this.lock = lock;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + name + " waiting for count lock");
            lock.lock();
            System.out.println("Thread " + name + " locked count");

            Shared.count++;
            System.out.println("Thread " + name + ": " + Shared.count);

            System.out.println("Thread " + name + " sleeps");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Thread " + name + " unlocks count");
            lock.unlock();
        }
    }
}
