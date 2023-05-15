package com.danil.javacore.chapter05;

import java.io.IOException;

class Menu {
    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println("Help:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for\n");

            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if (condition) statement-true else statement-false");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch (condition) {");
                System.out.println("    case const:");
                System.out.println("        statement");
                System.out.println("        ...");
                System.out.println("    case const:");
                System.out.println("    ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while (condition) statement");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do statement while (condition);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for (declaration or expression; condition; expression) statement");
                break;
        }
    }
}
