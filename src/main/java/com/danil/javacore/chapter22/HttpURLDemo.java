package com.danil.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://google.com");

        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        System.out.println("Request method: " + hpCon.getRequestMethod());
        System.out.println("Response code: " + hpCon.getResponseCode());
        System.out.println("Response message: " + hpCon.getResponseMessage());

        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("Header:");
        for (String k : hdrField) {
            System.out.println(k + ": " + hdrMap.get(k));
        }
    }
}
