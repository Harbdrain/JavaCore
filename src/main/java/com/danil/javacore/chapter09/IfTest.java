package com.danil.javacore.chapter09;

class IfTest {
    public static void main(String[] args) {
        FixedStack stack1 = new FixedStack(5);
        FixedStack stack2 = new FixedStack(8);

        IntStack stack = stack1;
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        stack = stack2;
        for (int i = 0; i < 8; i++) {
            stack.push(i);
        }

        System.out.println("stack1:");
        stack = stack1;
        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        System.out.println("stack2:");
        stack = stack2;
        for (int i = 0; i < 8; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
