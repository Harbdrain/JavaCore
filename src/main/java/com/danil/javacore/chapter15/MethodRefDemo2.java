package com.danil.javacore.chapter15;

class MethodRefDemo2 {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inS = "lambda expression";
        MyStringOps myOps = new MyStringOps();
        String outS = stringOp(myOps::strReverse2, inS);
        System.out.println(outS);
    }
}
