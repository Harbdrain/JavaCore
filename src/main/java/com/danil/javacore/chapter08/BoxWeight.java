package com.danil.javacore.chapter08;

class BoxWeight extends Box {
    double weight;
    
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}
