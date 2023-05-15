package com.danil.javacore.chapter05;

class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Entering third scope");
                    if (t) {
                        break second;
                        // System.out.println("Unreachable code in third scope after break");
                    }
                }
                System.out.println("Unreachable code in second scope");
            }
            System.out.println("After second scope");
        }
    }
}
