package com.danil.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll, r);
        System.out.println("Reverse sorted ll: " + ll);

        Collections.shuffle(ll);
        System.out.println("Shuffled ll: " + ll);

        System.out.println("min: " + Collections.min(ll));
        System.out.println("max: " + Collections.max(ll));
    }
}
