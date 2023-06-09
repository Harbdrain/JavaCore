package com.danil.javacore.chapter18;

import java.util.TreeSet;

class CompDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
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
