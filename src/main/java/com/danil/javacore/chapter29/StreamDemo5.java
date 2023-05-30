package com.danil.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;

    String phonenum;
    String email;

    public NamePhoneEmail(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }

    @Override
    public String toString() {
        return "NamePhoneEmail{name=" + name + ", phonenum=" + phonenum + ", email=" + email + "}";
    }
}

class NamePhone {
    String name;
    String phonenum;

    public NamePhone(String name, String phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }

    @Override
    public String toString() {
        return "NamePhone{name=" + name + ", phonenum=" + phonenum + "}";
    }
}

class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@HerbSchildt.com"));

        System.out.print("myList: ");
        myList.stream().forEachOrdered(e -> System.out.print(e + " "));
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map(e -> new NamePhone(e.name, e.phonenum));
        System.out.print("nameAndPhone: ");
        nameAndPhone.forEachOrdered(e -> System.out.print(e + " "));
        System.out.println();
    }
}
