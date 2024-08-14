package com.HT.random;

import java.util.Random;

public class randomdemo {
    public static void main(String[] args) {

        Random rand = new Random();

        for (int i=0;i<20;i++) {
            int data = rand.nextInt(10);
            System.out.println(data);
        }
    }
}
