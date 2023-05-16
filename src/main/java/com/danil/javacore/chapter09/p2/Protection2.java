package com.danil.javacore.chapter09.p2;

class Protection2 extends com.danil.javacore.chapter09.p1.Protection {
    Protection2() {
        System.out.println("Subclass from different package constructor");

        // System.out.println("n: " + n); // Error
        // System.out.println("n_pri: " + n_pri); // Error
        System.out.println("n_pro: " + n_pro);
        System.out.println("n_pub: " + n_pub);
    }
}
