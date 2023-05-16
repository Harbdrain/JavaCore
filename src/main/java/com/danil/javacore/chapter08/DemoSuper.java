package com.danil.javacore.chapter08;

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight box2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight box3 = new BoxWeight();
        BoxWeight cube = new BoxWeight(3, 2);
        BoxWeight clone = new BoxWeight(box1);

        System.out.println("box1");
        System.out.println("box1.vol: " + box1.volume());
        System.out.println("box1.w: " + box1.weight);
        System.out.println();

        System.out.println("box2");
        System.out.println("box2.vol: " + box2.volume());
        System.out.println("box2.w: " + box2.weight);
        System.out.println();

        System.out.println("box3");
        System.out.println("box3.vol: " + box3.volume());
        System.out.println("box3.w: " + box3.weight);
        System.out.println();

        System.out.println("cube");
        System.out.println("cube.vol: " + cube.volume());
        System.out.println("cube.w: " + cube.weight);
        System.out.println();

        System.out.println("clone");
        System.out.println("clone.vol: " + clone.volume());
        System.out.println("clone.w: " + clone.weight);
        System.out.println();

    }
}
