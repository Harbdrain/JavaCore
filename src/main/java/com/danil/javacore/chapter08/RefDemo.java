package com.danil.javacore.chapter08;

class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();

        System.out.println("weightBox.vol: " + weightBox.volume());
        System.out.println("weightBox.w: " + weightBox.weight);
        System.out.println();

        plainBox = weightBox;
        System.out.println("plainBox.vol: " + plainBox.volume());
        // System.out.println("plainBox.w: " + plainBox.weight); // Error
    }
}
