package com.danil.javacore.chapter15;

import java.util.function.Function;

class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i < n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("3! = " + factorial.apply(3));
        System.out.println("5! = " + factorial.apply(5));
    }
}
