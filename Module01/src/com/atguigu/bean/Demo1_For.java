package com.atguigu.bean;

/**
 * for语句
 */
public class Demo1_For {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello world");
            System.out.println("i = " + i);
        }

        System.out.println("===================");
        for (int i = 10; i >= 1; i--) {
            System.out.println("hello world");
            System.out.println("i = " + i);
        }
    }
}
