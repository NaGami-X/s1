package com.HT.shuzu;

public class shuzu {
    public static void main(String[] args) {
       int[] money = {16, 26, 36, 6, 100};
       int s1 = 0;
       for (int i = 0; i < money.length; i++) {

           s1 += money[i];
           System.out.println(s1);
       }
    }
}
