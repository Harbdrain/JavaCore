package com.danil.javacore.chapter06;

class BoxDemo2 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        double vol;

        box1.width = 10;
        box1.height = 20;
        box1.depth = 15;

        box2.width = 3;
        box2.height = 6;
        box2.depth = 9;

        vol = box1.depth * box1.height * box1.depth;
        System.out.println("Box1 volume: " + vol);
        vol = box2.depth * box2.height * box2.depth;
        System.out.println("Box2 volume: " + vol);
    }
}
