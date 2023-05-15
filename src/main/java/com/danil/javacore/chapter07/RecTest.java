package com.danil.javacore.chapter07;

class RecTest {
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if (i == 0) {
            return;
        }

        printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
