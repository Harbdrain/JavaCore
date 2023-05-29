package com.danil.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("files/file1.txt");

        System.out.println("filename: " + filepath.getName(1));
        System.out.println("file path: " + filepath);
        System.out.println("absolute path: " + filepath.toAbsolutePath());
        System.out.println("parent dir: " + filepath.getParent());
        if (Files.exists(filepath)) {
            System.out.println("file exists");
        } else {
            System.out.println("file does not exists");
        }

        try {
            if (Files.isHidden(filepath)) {
                System.out.println("file is hidden");
            } else {
                System.out.println("file does not hidden");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        if (Files.isWritable(filepath)) {
            System.out.println("file is writable");
        } else {
            System.out.println("file is not writable");
        }
        if (Files.isReadable(filepath)) {
            System.out.println("file is readable");
        } else {
            System.out.println("file is readable");
        }

        try {
            BasicFileAttributes attribs = Files.readAttributes(filepath, BasicFileAttributes.class);

            if (attribs.isDirectory()) {
                System.out.println("this is directory");
            } else {
                System.out.println("this is not directory");
            }
            if (attribs.isRegularFile()) {
                System.out.println("this is regular file");
            } else {
                System.out.println("this is not regular file");
            }
            if (attribs.isSymbolicLink()) {
                System.out.println("this is symlink");
            } else {
                System.out.println("this is not symlink");
            }

            System.out.println("last modification time: " + attribs.lastModifiedTime());
            System.out.println("file size: " + attribs.size() + " bytes");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
