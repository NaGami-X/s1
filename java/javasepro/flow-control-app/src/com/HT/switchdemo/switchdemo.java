package com.HT.switchdemo;

public class switchdemo {
    public static void main(String[] args) {
        String week = "周三";
        switch (week) {
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("3");
                break;
            case "周四":
                System.out.println("4");
                break;
            case "周五":
                System.out.println("5");
                break;
            case "周六":
                System.out.println("6");
                break;
            case "周七":
                System.out.println("7");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
