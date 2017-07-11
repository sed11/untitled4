package com.company.Array;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final byte dayCount = 30;
        Random random = new Random();
        byte[] tempArray = new byte[dayCount];
        for (int i = 0; i < dayCount; i++) ;
        {
            tempArray[i] = (byte) (random.nextInt(20) + 10);
            System.out.println((i+1) +"Июля" + tempArray[i]+ "Градусов");


        }

    }
}
