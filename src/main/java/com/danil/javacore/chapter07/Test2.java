package com.danil.javacore.chapter07;

class Test2 {
    int a, b;

    Test2() {
        a = -1;
        b = -1;
    }

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void meth(Test2 ob) {
        ob.a *= 2;
        ob.b /= 2;
    }
}
