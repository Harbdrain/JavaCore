package com.danil.javacore.chapter20;

import java.io.File;

class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("files/COPYRIGHT");
        p("file name: " + f1.getName());
        p("path: " + f1.getPath());
        p("absolute path: " + f1.getAbsolutePath());
        p("parent directory: " + f1.getParent());
        p(f1.exists() ? "exists" : "not exists");
        p(f1.canWrite() ? "can write" : "cannot write");
        p(f1.canRead() ? "can read" : "cannot read");
        p(f1.isDirectory() ? "is directory" : "not directory");
        p(f1.isFile() ? "is file" : "not file");
        p(f1.isAbsolute() ? "is absolute" : "not absolute");
        p("last modified: " + f1.lastModified());
        p("size: " + f1.length() + " byte");
    }
}
