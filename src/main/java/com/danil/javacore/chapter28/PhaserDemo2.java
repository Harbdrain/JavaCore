package com.danil.javacore.chapter28;

import java.util.concurrent.Phaser;

class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    protected boolean onAdvance(int p, int regParties) {
        System.out.println("Phase " + p + " ended\n");
        return p == numPhases || regParties == 0;
    }
}

class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);

        System.out.println("Starting threads");

        new MyThread4(phsr, "A");
        new MyThread4(phsr, "B");
        new MyThread4(phsr, "C");

        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }

        System.out.println("Phaser stopped");
    }
}

class MyThread4 implements Runnable {
    Phaser phsr;
    String name;

    public MyThread4(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        phsr.register();
        new Thread(this, name).start();
    }


    @Override
    public void run() {
        while (!phsr.isTerminated()) {
            System.out.println("Thread " + name + " starting phase " + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
