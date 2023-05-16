package com.danil.javacore.chapter09;

class IfTest2 {
    public static void main(String[] args) {
        DynStack stack1 = new DynStack(5);
        DynStack stack2 = new DynStack(8);

        IntStack stack = stack1;
        for (int i = 0; i < 12; i++) {
            stack.push(i);
        }
        stack = stack2;
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }

        System.out.println("stack1:");
        stack = stack1;
        for (int i = 0; i < 12; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        System.out.println("stack2:");
        stack = stack2;
        for (int i = 0; i < 20; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
