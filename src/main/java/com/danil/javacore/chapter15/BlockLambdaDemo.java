package com.danil.javacore.chapter15;

interface NumericFunc {
    int func(int n);
}

class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("3! = " + factorial.func(3));
        System.out.println("5! = " + factorial.func(5));
    }
}
