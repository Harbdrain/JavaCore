package com.danil.javacore.chapter15;

interface MyFunc3<T> {
    int func(T[] vals, T v);
}

class MyArrayOps2 {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }

        return count;
    }
}

class GenericMethodRefDemo {
    static <T> int myOp(MyFunc3<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
        String[] strs = { "one", "two", "three", "two" };
        int count;
        count = myOp(MyArrayOps2::countMatching, vals, 4);
        System.out.println(count);

        count = myOp(MyArrayOps2::countMatching, strs, "two");
        System.out.println(count);
    }
}
