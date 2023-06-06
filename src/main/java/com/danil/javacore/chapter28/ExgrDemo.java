package com.danil.javacore.chapter28;

import java.util.concurrent.Exchanger;

class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<>();
        new UseString(exgr);
        new MakeString(exgr);
    }
}

class MakeString implements Runnable {
    Exchanger<String> exgr;
    String str;

    public MakeString(Exchanger<String> exgr) {
        this.exgr = exgr;
        str = new String();
        new Thread(this).start();
    }

    @Override
    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }

            try {
                str = exgr.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class UseString implements Runnable {
    Exchanger<String> exgr;
    String str;

    public UseString(Exchanger<String> exgr) {
        this.exgr = exgr;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                str = exgr.exchange(new String());
                System.out.println("Got: " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
