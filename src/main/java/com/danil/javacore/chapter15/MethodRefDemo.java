package com.danil.javacore.chapter15;

class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i > -1; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inS = "lambda expression";
        String outS = stringOp(MyStringOps::strReverse, inS);
        System.out.println(outS);
    }
}
