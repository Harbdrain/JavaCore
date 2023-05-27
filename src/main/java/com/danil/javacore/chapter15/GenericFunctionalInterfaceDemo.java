package com.danil.javacore.chapter15;

interface SomeFunc<T> {
    T func(T t);
}

class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (s) -> {
            String result = "";
            int i;

            for (i = s.length() - 1; i > -1; i--) {
                result += s.charAt(i);
            }

            return result;
        };

        System.out.println("reverse(\"lambda\"): " + reverse.func("lambda"));
        System.out.println("reverse(\"expression\"): " + reverse.func("expression"));
    }
}
