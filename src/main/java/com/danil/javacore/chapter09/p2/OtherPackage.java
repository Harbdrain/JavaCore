package com.danil.javacore.chapter09.p2;

class OtherPackage {
    OtherPackage() {
        com.danil.javacore.chapter09.p1.Protection p = new com.danil.javacore.chapter09.p1.Protection();
        System.out.println("Different package constructor");

        // System.out.println("n: " + p.n); // Error
        // System.out.println("n_pri: " + p.n_pri); // Error
        // System.out.println("n_pro: " + p.n_pro); // Error
        System.out.println("n_pub: " + p.n_pub);
    }
}
