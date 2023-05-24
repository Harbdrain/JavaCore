package com.danil.javacore.chapter18;

import java.util.Comparator;

class TComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        int i, j, k;
        i = a.lastIndexOf(' ');
        j = b.lastIndexOf(' ');
        k = a.substring(i).compareTo(b.substring(j));
        if (k == 0) {
            return a.compareTo(b);
        }
        return k;
    }

}
