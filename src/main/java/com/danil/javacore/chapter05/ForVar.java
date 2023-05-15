package com.danil.javacore.chapter05;

class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for (; !done;)  {
            System.out.println("i: " + i);
            done = i == 10;
            i++;
        }
    }
}
