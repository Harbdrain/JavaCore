package com.danil.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

class SplititeratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<Double>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.print("vals: ");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.print(n + " ")))
            ;
        System.out.println();

        spltitr = vals.spliterator();
        ArrayList<Double> sqrts = new ArrayList<Double>();
        while (spltitr.tryAdvance((n) -> sqrts.add(Math.sqrt(n))))
            ;

        System.out.print("sqrts: ");
        spltitr = sqrts.spliterator();
        spltitr.forEachRemaining((n) -> System.out.print(n + " "));
        System.out.println();
    }
}
