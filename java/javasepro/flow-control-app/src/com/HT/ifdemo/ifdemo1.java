package com.HT.ifdemo;

import java.sql.SQLOutput;

public class ifdemo1 {
    public static void main(String[] args) {
        double t = 38.9;
        if (t > 37){
            System.out.println("这个人温度异常");
        }
        double money = 99;
        if (money >= 90){
            System.out.println("发红包成功了~");
        }else {
            System.out.println("余额不足~");
        }
        int score = 78;
        if (score >= 90){
            System.out.println("您的绩点级别为：A");

        }else if (score < 90 && score >= 70){
            System.out.println("您的绩点级别");
        }else {
            System.out.println("输入的数字有误");
        }

    }
}
