package com.danil.javacore.chapter07;

class Stack {
    private int[] stck = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int num) {
        if (tos > 9) {
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
