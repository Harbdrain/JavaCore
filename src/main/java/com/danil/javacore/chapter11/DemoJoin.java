package com.danil.javacore.chapter11;

class DemoJoin {
    public static void main(String[] args) {
        NewThread3 th1 = new NewThread3("First");
        NewThread3 th2 = new NewThread3("Second");
        NewThread3 th3 = new NewThread3("Third");

        System.out.println("First thread is started: " + th1.t.isAlive());
        System.out.println("Second thread is started: " + th2.t.isAlive());
        System.out.println("Third thread is started: " + th3.t.isAlive());

        try {
            th1.t.join();
            th2.t.join();
            th3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("First thread is started: " + th1.t.isAlive());
        System.out.println("Second thread is started: " + th2.t.isAlive());
        System.out.println("Third thread is started: " + th3.t.isAlive());

        System.out.println("Main thread stopped");
    }
}
