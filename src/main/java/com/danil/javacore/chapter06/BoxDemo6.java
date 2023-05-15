package com.danil.javacore.chapter06;

class BoxDemo6 {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box(3, 6, 9);

        System.out.println("Box1 volume: " + box1.volume());
        System.out.println("Box2 volume: " + box2.volume());
    }
}
