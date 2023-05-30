package com.danil.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("myList: " + myList);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) {
            System.out.println("Min: " + minVal.get());
        }

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) {
            System.out.println("Max: " + maxVal.get());
        }

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.print("Sorted stream: ");
        sortedStream.forEach(e -> System.out.print(e + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter(e -> e % 2 == 1);
        System.out.print("Odd values: ");
        oddVals.forEach(e -> System.out.print(e + " "));
        System.out.println();

        oddVals = myList.stream().filter(e -> e % 2 == 1).filter(e -> e > 5);
        System.out.print("Odd values greater than 5: ");
        oddVals.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
