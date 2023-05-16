package com.danil.javacore.chapter09;

interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        System.out.println("clear() is not implemented");
    }
}
