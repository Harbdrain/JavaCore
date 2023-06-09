package com.danil.javacore.chapter15;

interface NumericTest {
    boolean test(int n);
}

class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> n % 2 == 0;

        if (isEven.test(10)) {
            System.out.println("10 is even");
        }
        if (!isEven.test(9)) {
            System.out.println("9 is not even");
        }

        NumericTest isNotNeg = (n) -> n > -1;
        if (isNotNeg.test(1)) {
            System.out.println("1 is not neg");
        }
        if (!isNotNeg.test(-1)) {
            System.out.println("-1 is neg");
        }
    }
}
