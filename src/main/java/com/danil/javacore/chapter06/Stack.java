package com.danil.javacore.chapter06;

class Stack {
    int[] stck = new int[10];
    int tos;

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
