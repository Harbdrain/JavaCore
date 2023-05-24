package com.danil.javacore.chapter18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {

        }

        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("File input error");
        }

        do {
            System.out.println("Input name. Type 'exit' for exit");
            name = br.readLine();
            if (name.equals("exit")) {
                continue;
            }
            System.out.println("Input number:");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("exit"));

        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "phonebook");
            fout.close();
        }

        do {
            System.out.println("Input name for search: ");
            name = br.readLine();
            if (name.equals("exit")) {
                continue;
            }
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("exit"));
    }
}
