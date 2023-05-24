package com.danil.javacore.chapter18;

import java.util.TreeSet;

class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String s : ts) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
