package com.Sobhitha;

public class Main {

    public static void main(String[] args) {

         //int has the width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myToatal=" + myTotal);

        // byte has the width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2); //method of casting
        System.out.println("myNewByteValue=" + myNewByteValue);

        //short has the width of 16
        short myShortValue = 32767;

        //long has the width of 64
        long myLongValue = 9_223_372_036_854_775_807L;


            }
}
