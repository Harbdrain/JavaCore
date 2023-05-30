package com.danil.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://herbschildt.com/Articles"); // deprecated. Use URI instead

        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());
        System.out.println("Hostname: " + hp.getHost());
        System.out.println("File: " + hp.getFile());
        System.out.println("Full form: " + hp.toExternalForm());
    }
}
