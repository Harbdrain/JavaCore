package com.danil.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BRReadLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Input string");
        System.out.println("type 'quit' for stop");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("quit"));
    }
}
