package com.danil.javacore.chapter09;

interface MyIf {
    int getNumber();

    default String getString() {
        return "default method";
    }
}
