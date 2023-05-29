package com.danil.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class NIOCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: NIOCopy <source> <target>");
            return;
        }

        try {
            Path source = Paths.get(args[0]);
            Path target = Paths.get(args[1]);
            Files.copy(source, target);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
