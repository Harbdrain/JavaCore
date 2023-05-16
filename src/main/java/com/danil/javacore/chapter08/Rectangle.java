package com.danil.javacore.chapter08;

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Rectangle");
        return dim1 * dim2;
    }
}
