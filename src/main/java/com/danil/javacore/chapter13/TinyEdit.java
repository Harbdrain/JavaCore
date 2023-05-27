package com.danil.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];

        System.out.println("Input string");
        System.out.println("Type 'quit' for stop");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("quit")) {
                break;
            }
        }

        System.out.println("Input data:");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("quit")) {
                break;
            }
            System.out.println(str[i]);
        }
    }
}
