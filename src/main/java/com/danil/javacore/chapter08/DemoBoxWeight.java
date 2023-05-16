package com.danil.javacore.chapter08;

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight box2 = new BoxWeight(2, 3, 4, 0.076);

        System.out.println("box1.vol " + box1.volume());
        System.out.println("box1.w " + box1.weight);
        System.out.println("box2.vol " + box2.volume());
        System.out.println("box2.w " + box2.weight);
    }
}
