package com.danil.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;

class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);

        System.out.print("myList: ");
        myList.stream().forEachOrdered(e -> System.out.print(e + " "));
        System.out.println();

        IntStream cStrm = myList.stream().mapToInt(e -> (int) Math.ceil(e));
        System.out.print("cStrm: ");
        cStrm.forEachOrdered(e -> System.out.print(e + " "));
        System.out.println();
    }
}
