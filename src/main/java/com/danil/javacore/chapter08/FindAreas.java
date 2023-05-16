package com.danil.javacore.chapter08;

class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure ref;

        ref = f;
        System.out.println(ref.area());
        ref = r;
        System.out.println(ref.area());
        ref = t;
        System.out.println(ref.area());

    }
}
