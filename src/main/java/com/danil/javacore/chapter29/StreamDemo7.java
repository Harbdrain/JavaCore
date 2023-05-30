package com.danil.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@HerbSchildt.com"));

        Stream<NamePhone> nameAndPhone = myList.stream().map(e -> new NamePhone(e.name, e.phonenum));
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("List: ");
        for (NamePhone e : npList) {
            System.out.println(e);
        }

        nameAndPhone = myList.stream().map(e -> new NamePhone(e.name, e.phonenum));
        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("Set: ");
        for (NamePhone e : npSet) {
            System.out.println(e);
        }
    }
}
