package com.danil.javacore.chapter10;

class FinallyDemo {
    static void procA() {
        try {
            System.out.println("in procA()");
            throw new RuntimeException("Demo");
        } finally {
            System.out.println("Finally in procA()");
        }
    }

    static void procB() {
        try {
            System.out.println("in procB()");
            return;
        } finally {
            System.out.println("Finally in procB()");
        }
    }
    static void procC() {
        try {
            System.out.println("in procC()");
        } finally {
            System.out.println("Finally in procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception in main()");
        }

        procB();
        procC();
    }
}
