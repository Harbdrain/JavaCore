package com.danil.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

class StreamDemo9 {
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

        while (splitItr.tryAdvance(e -> System.out.println(e)))
            ;
    }
}
