package com.danil.javacore.chapter18;

import java.util.Arrays;

class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        System.out.print("array: ");
        display(array);

        Arrays.sort(array);
        System.out.print("sorted array: ");
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.print("filled array: ");
        display(array);

        Arrays.sort(array);
        System.out.print("sorted array: ");
        display(array);

        int index = Arrays.binarySearch(array, -9);
        System.out.println("index of -9: " + index);
    }

    private static void display(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
