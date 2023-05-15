package com.danil.javacore.chapter04;

class ByteUShift {

    private static char[] hex = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
    };

    public static void main(String[] args) {

        byte b = (byte) 0xf1;
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0xff) >> 4);

        System.out.println("b: 0x" + conv(b));
        System.out.println("(b >> 4): 0x" + conv(c));
        System.out.println("(b >>> 4): 0x" + conv(d));
        System.out.println("((b & 0xff) >> 4): 0x" + conv(e));
    }

    private static String conv(byte n) {
        return "" + hex[(n >> 4) & 0x0f] + hex[n & 0x0f];
    }
}
