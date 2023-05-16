package com.danil.javacore.chapter08;

class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure ref;

        ref = r;
        System.out.println(ref.area());
        ref = t;
        System.out.println(ref.area());
    }
}
