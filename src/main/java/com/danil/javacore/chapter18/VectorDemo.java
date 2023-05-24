package com.danil.javacore.chapter18;

import java.util.Enumeration;
import java.util.Vector;

class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(3, 2);
        System.out.println("v.size(): " + v.size());
        System.out.println("v.capacity(): " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("v.capacity(): " + v.capacity());

        v.addElement(5);
        System.out.println("v.capacity(): " + v.capacity());

        v.addElement(6);
        v.addElement(7);
        System.out.println("v.capacity(): " + v.capacity());

        v.addElement(8);
        v.addElement(9);
        System.out.println("v.capacity(): " + v.capacity());

        v.addElement(10);
        v.addElement(11);

        System.out.println("first element: " + v.firstElement());
        System.out.println("last element: " + v.lastElement());
        System.out.println("v contains 3: " + v.contains(3));

        Enumeration<Integer> vEnum = v.elements();

        System.out.print("v: ");
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}
