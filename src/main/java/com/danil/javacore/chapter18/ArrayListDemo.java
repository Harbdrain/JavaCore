package com.danil.javacore.chapter18;

import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Started array size: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Array size after adding elements: " + al.size());
        System.out.println("Contents: " + al);

        al.remove("F");
        al.remove(2);
        System.out.println("Array size after removing elements: " + al.size());
        System.out.println("Contents: " + al);
    }
}
