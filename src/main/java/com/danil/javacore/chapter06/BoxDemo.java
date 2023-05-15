package com.danil.javacore.chapter06;

class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        double vol;

        box.width = 10;
        box.height = 20;
        box.depth = 15;

        vol = box.depth * box.height * box.depth;

        System.out.println("Volume: " + vol);
    }
}
