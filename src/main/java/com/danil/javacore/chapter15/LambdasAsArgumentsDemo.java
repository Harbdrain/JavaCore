package com.danil.javacore.chapter15;

class LambdasAsArguments {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inS = "Input expression";
        String outS = stringOp((s) -> s.toUpperCase(), inS);
        System.out.println(outS);

        outS = stringOp((s) -> {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    result += s.charAt(i);
                }
            }
            return result;
        }, inS);

        System.out.println(outS);
        StringFunc reverse = (s) -> {
            String result = "";
            int i;

            for (i = s.length() - 1; i > -1; i--) {
                result += s.charAt(i);
            }

            return result;
        };

        System.out.println(stringOp(reverse, inS));
    }
}
