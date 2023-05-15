package com.danil.javacore.chapter07;

class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equals(Test o) {
        return o.a == a && o.b == b;
    }
}
