package com.danil.javacore.chapter05;

class ForEach2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int num : nums) {
            sum += num;
            if (num == 5) {
                break;
            }
        }

        System.out.println(sum);
    }
}
