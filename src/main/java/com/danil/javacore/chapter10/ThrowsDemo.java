package com.danil.javacore.chapter10;

class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("in throwOne()");
        throw new IllegalAccessException("demo"); 
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
    }
}
