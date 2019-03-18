package com.Sobhitha;

public class Assignprac {
    public static void main(String[] args) {

        byte myByte = 10;
        short myShort = 20;
        int myInt = 100;

        long mylong = 50000L + 10L + (myByte + myInt + myShort);

        short myShortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));

        System.out.println("myLongValue =" + mylong);
        System.out.println("MyShortTotal = " + myShortTotal);
    }
}
