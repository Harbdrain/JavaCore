package com.danil.javacore.chapter05;

class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;

        isPrime = num >= 2;

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        String result;
        result = isPrime ? "prime" : "composite";
        System.out.println(result);
    }
}
