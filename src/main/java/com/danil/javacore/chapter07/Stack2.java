package com.danil.javacore.chapter07;

class Stack2 {
    private int[] stck;
    private int tos;

    Stack2(int size) {
        tos = -1;
        stck = new int[size];
    }

    void push(int num) {
        if (tos == stck.length - 1) {
            System.out.println("Error: Stack is full.");
            return;
        }
        stck[++tos] = num;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Error: Stack is empty");
            return 0;
        }
        return stck[tos--];
    }
}
