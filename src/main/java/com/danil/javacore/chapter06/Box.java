package com.danil.javacore.chapter06;

class Box {
    double width;
    double height;
    double depth;

    Box() {
    };

    Box(double w, double h, double d) {
        setDim(w, h, d);
    }

    void printVolume() {
        System.out.println("Volume: " + (width * height * depth));
    }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
