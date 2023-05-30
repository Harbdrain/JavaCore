package com.danil.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Beta");
        myList.add("Alpha");
        myList.add("Eta");
        myList.add("Gamma");
        myList.add("Epsilon");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();
        Iterator<String> itr = myStream.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
