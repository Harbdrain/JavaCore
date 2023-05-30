package com.danil.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

class UCDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://internic.net"); // deprecated. Use URI instead
        URLConnection hpCon = hp.openConnection();
        long d = hpCon.getDate();

        if (d == 0) {
            System.out.println("Date data is missing");
        } else {
            System.out.println("Date: " + new Date(d));
        }

        System.out.println("Content-type: " + hpCon.getContentType());

        d = hpCon.getExpiration();
        if (d == 0) {
            System.out.println("Expiration data is missing");
        } else {
            System.out.println("Expiration: " + new Date(d));
        }

        d = hpCon.getLastModified();
        if (d == 0) {
            System.out.println("Last modified data is missing");
        } else {
            System.out.println("Last modified: " + new Date(d));
        }

        d = hpCon.getContentLength();
        if (d == 0) {
            System.out.println("Content length data is missing");
        } else {
            System.out.println("Content length: " + d);
        }

        if (d != 0) {
            System.out.println("=== Content ===");
            InputStream input = hpCon.getInputStream();
            int c;
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("Content is not available");
        }
    }
}
