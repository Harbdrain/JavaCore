package com.danil.javacore.chapter06;

class BoxDemo5 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.setDim(10, 20, 15);
        box2.setDim(3, 6, 9);

        System.out.println("Box1 volume: " + box1.volume());
        System.out.println("Box2 volume: " + box2.volume());
    }
}
