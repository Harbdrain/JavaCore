package com.danil.javacore.chapter10;

class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a: " + a);
            int b = 42 / a;
            int[] c = { 1 };
            c[42] = 99;
        } catch (Exception e) {
            System.out.println(e);
        } /* // Unreachable code
           * catch (ArrayIndexOutOfBoundsException e) {
           * System.out.println(e);
           * }
           */
        System.out.println("after exception handling");
    }
}
