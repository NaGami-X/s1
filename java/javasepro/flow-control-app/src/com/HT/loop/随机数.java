package com.HT.loop;

import java.util.Random;
import java.util.Scanner;

public class 随机数 {
    public static void main(String[] args) {

        Random r = new Random();

        int sss1 = r.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入您猜测的数据：");
            int sss2 = sc.nextInt();

            if (sss2 > sss1){
                System.out.println("您猜测的数据过大");
            }else if (sss2 < sss1){
                System.out.println("您猜测的数据过小");
            }else{
                System.out.println("您猜对了，获得奖品");
                break;
            }
        }
    }
}
