package com.danil.javacore.chapter29;

import java.util.ArrayList;

class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        double productOfSqrRoots = myList.parallelStream().reduce(1.0, (r, e) -> r * Math.sqrt(e), (a, b) -> a * b);

        System.out.println(productOfSqrRoots);
    }
}