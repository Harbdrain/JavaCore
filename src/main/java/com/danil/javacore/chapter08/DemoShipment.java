package com.danil.javacore.chapter08;

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.14);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        System.out.println("shipment1.vol: " + shipment1.volume());
        System.out.println("shipment1.w: " + shipment1.weight);
        System.out.println("shipment1.c: " + shipment1.cost);
        System.out.println();

        System.out.println("shipment2.vol: " + shipment2.volume());
        System.out.println("shipment2.w: " + shipment2.weight);
        System.out.println("shipment2.c: " + shipment2.cost);
        System.out.println();
    }
}
