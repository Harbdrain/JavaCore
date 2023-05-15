package com.danil.javacore.chapter07;

class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "First string";
        String s2 = "Second string";
        String s3 = s1;

        System.out.println("s1.length: " + s1.length());
        System.out.println("s1[3]: " + s1.charAt(3));

        if (s1.equals(s2)) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        if (s1.equals(s3)) {
            System.out.println("s1 == s3");
        } else {
            System.out.println("s1 != s3");
        }
    }
}
