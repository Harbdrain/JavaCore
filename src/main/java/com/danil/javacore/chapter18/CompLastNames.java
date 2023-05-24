package com.danil.javacore.chapter18;

import java.util.Comparator;

class CompLastNames implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        int i, j;
        i = a.lastIndexOf(' ');
        j = b.lastIndexOf(' ');
        return a.substring(i).compareTo(b.substring(j));
    }

}
