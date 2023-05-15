package com.danil.javacore.chapter06;

class Box {
    double width;
    double height;
    double depth;

    void printVolume() {
        System.out.println("Volume: " + (width * height * depth));
    }
    double volume() {
        return width * height * depth;
    }
}
