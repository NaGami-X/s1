package com.ht.overload;

public class test2 {
    public static void main(String[] args) {
        fire();
        fire("岛国");
        fire()

    }
    public static void fire(){
        System.out.println("默认给岛国发射了一枚武器~~");

    }
    public static void fire(String country){
        System.out.println("发射了一枚武器给"+ country);
    }
    public static void fire(String country, int number){
        System.out.println("发射了"+number +"枚武器给"+country);

    }
}
