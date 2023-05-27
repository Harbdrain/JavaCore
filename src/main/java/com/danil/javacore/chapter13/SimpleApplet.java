package com.danil.javacore.chapter13;

import java.applet.Applet;
import java.awt.Graphics;

public class SimpleApplet extends Applet { // deprecated. Does not support in modern browsers
    public void paint(Graphics g) {
        g.drawString("Simple applet", 20, 20);
    }
}
