package com.danil.javacore.chapter07;

class VarArgs {
    static void vaTest(int... v) {
        System.out.println("arg count: " + v.length);

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(10);
        vaTest();
    }
}
