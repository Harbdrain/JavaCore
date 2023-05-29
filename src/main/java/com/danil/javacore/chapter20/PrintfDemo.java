package com.danil.javacore.chapter20;

class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Different int formats");
        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);

        System.out.println();
        System.out.printf("Float: %f\n", 1234567.123);
        System.out.printf("Float with , : %,f\n", 1234567.123);
        System.out.printf("Negative float: %,f\n", -1234567.123);
        System.out.printf("Negative float: %,(f\n", -1234567.123);
        System.out.println();

        System.out.printf("%,.2f\n%,.2f\n", 1234567.123, -1234567.123);
    }
}
