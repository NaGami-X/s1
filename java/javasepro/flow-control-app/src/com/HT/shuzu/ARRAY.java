package com.HT.shuzu;

import java.util.Scanner;

public class ARRAY {
    public static void main(String[] args) {


        double[] scores = new double[6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入当前第" + (i+1) + "个评委的分数：");
            scores[i] = sc.nextDouble();

        }
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {

            sum += scores[i];

        }
        System.out.println("最终选手的得分是" + sum/ scores.length);
    }
}
