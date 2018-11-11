package com.atguigu.bean;

import java.util.Scanner;

public class Demo_Scanner {
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);  //创建键盘录入对象
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();   //将键盘录入的数据存储在x中
        System.out.println(x);*/

        //录入两个整数
        //Scanner sc = new Scanner(System.in);  //创建键盘录入对象
        Scanner sc = new Scanner(System.in); //创建键盘录入对象
        System.out.println("请输入第一个整数：");
        int x = sc.nextInt();   //将键盘录入的数据存储在x中
        System.out.println(x);

        System.out.println("请输入第二个整数：");
        int y = sc.nextInt();   //将键盘录入的数据存储在y中
        System.out.println(y);
    }
}
