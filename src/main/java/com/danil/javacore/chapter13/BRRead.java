package com.danil.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input characters. 'q' for exit");

        do {
            c = (char) br.read();
            if (c != '\n') {
                System.out.println(c);
            }
        } while (c != 'q');
    }
}
