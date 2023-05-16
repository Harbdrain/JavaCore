package com.danil.javacore.chapter09;

class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    FixedStack(int size) {
        tos = -1;
        stck = new int[size];
    }

    public void push(int num) {
        if (tos == stck.length - 1) {
            System.out.println("Error: Stack is full.");
            return;
        }
        stck[++tos] = num;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Error: Stack is empty");
            return 0;
        }
        return stck[tos--];
    }
}
