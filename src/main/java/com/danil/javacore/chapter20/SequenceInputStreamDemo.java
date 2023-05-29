package com.danil.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (IOException e) {
            return null;
        }
    }
}

class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        files.addElement("files/file1.txt");
        files.addElement("files/file2.txt");
        files.addElement("files/file3.txt");

        InputStreamEnumerator ise = new InputStreamEnumerator(files);

        try (InputStream input = new SequenceInputStream(ise)) {
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.print(e);
        }
    }
}
