package com.danil.javacore.chapter07;

class OverloadCons2 {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box();
        Box cube = new Box(7);

        Box clone = new Box(box1);

        System.out.println("Box1 volume: " + box1.volume());
        System.out.println("Box2 volume: " + box2.volume());
        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Clone volume: " + clone.volume());
    }
}
