package com.danil.javacore.chapter18;

import java.util.Comparator;

class CompThenByFirstName implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        return a.compareToIgnoreCase(b);
    }

}
