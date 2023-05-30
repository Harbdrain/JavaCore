package com.danil.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Beta");
        myList.add("Alpha");
        myList.add("Eta");
        myList.add("Gamma");
        myList.add("Epsilon");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();
        Spliterator<String> splitItr = myStream.spliterator();
        Spliterator<String> splitItr2 = splitItr.trySplit();

        if (splitItr2 != null) {
            System.out.println("splitItr2: ");
            while (splitItr2.tryAdvance(e -> System.out.println(e)))
                ;
        }

        System.out.println("splitItr: ");
        while (splitItr.tryAdvance(e -> System.out.println(e)))
            ;
    }
}
