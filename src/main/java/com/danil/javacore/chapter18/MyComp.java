package com.danil.javacore.chapter18;

import java.util.Comparator;

class MyComp implements Comparator<String> {

    @Override
    public int compare(String arg0, String arg1) {
        String a, b;
        a = arg0;
        b = arg1;
        return b.compareTo(a);
    }

}
