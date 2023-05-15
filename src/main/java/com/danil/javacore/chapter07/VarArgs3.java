package com.danil.javacore.chapter07;

class VarArgs3 {
    static void vaTest(int... v) {
        System.out.println("vaTest(int...): arg count: " + v.length);

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean...): arg count: " + v.length);

        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    


    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(10);
        vaTest(true, true, false);
        // vaTest(); // Error
    }
}
