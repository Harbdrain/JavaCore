package com.danil.javacore.chapter15;

interface MyFunc {
    int func(int n);
}

class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MyFunc lambda = n -> {
            int v = num + n;
            // num++; // Error

            return v;
        };

//        num = 9;
    }
}
