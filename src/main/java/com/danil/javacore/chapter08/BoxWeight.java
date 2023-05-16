package com.danil.javacore.chapter08;

class BoxWeight extends Box {
    double weight;
    
    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
}
