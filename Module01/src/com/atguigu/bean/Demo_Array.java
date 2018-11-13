package com.atguigu.bean;

/**
 * 数组定义格式：
 *      数据类型[] 数组名 = new 数据类型[数组的长度]
 *
 *  整数类型：byte，short、int、long默认初始化值都是0
 *  浮点类型：float、double默认初始化值都是0.0
 *  布尔类型：boolean默认初始化值是false
 *  字符类型：char默认初始化值是'\u0000'：chart在内存中占的两个字节，是16进制位
 *              \u0000，每一个0其实代表的是16进制的0，那么4个0就是代表16个二进制位
 */
public class Demo_Array {
    public static void main(String[] args) {
        int x = 10;
        x = 20;

        System.out.println("x = " + x);

        // 数据类型[] 数组名 = new 数据类型[数组的长度]
        int[] arr = new int[5];

        /**
         * 左边：
         * int:数据类型
         * []:代表的是数组，几个中括号就代表几维数组
         * arr:合法的标识符
         *
         * 右边：
         * new:创建新的实体或对象
         * []:代表数组
         * 5:代表数组的长度
         */

        System.out.println(arr[0]);    //系统给出默认初始化值，整数类型的都是0

        arr[0] = 10;

        System.out.println(arr[0]);

    }
}
