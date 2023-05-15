package com.danil.javacore.chapter07;

class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + " " + v.length);

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("1 arg", 1, 2, 3);
        vaTest("2 args", 10);
        vaTest("0 args");
    }
}
