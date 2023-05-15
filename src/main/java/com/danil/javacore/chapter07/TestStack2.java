package com.danil.javacore.chapter07;

class TestStack2 {
    public static void main(String[] args) {
        Stack2 stack1 = new Stack2(5);
        Stack2 stack2 = new Stack2(8);

        for (int i = 0; i < 5; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            stack2.push(i);
        }

        System.out.println("Stack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(stack1.pop() + " ");
        }
        System.out.println();

        System.out.println("Stack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(stack2.pop() + " ");
        }
        System.out.println();
    }
}
