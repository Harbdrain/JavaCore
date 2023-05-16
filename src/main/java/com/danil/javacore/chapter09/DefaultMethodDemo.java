package com.danil.javacore.chapter09;

class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIfImp o = new MyIfImp();
        MyIfImp2 o2 = new MyIfImp2();

        System.out.println(o.getNumber());
        System.out.println(o.getString());
        System.out.println(o2.getNumber());
        System.out.println(o2.getString());
    }
}
