package com.ht.overload;

public class methodoverload {
    public static void main(String[] args) {
        test();
        test(100);

    }
    public static void test() {
        System.out.println("===test1===");
    }
    public static void test(int a) {
        System.out.println("===test2===");

    }
    void test(double a){
        System.out.println();
    }
}
