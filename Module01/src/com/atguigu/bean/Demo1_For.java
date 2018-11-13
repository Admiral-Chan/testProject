package com.atguigu.bean;

/**
 * for语句
 */
public class Demo1_For {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++) {
            System.out.println("hello world");
            System.out.println("i = " + i);
        }*/

        /*System.out.println("===================");
        for (int i = 10; i >= 1; i--) {
            System.out.println("hello world");
            System.out.println("i = " + i);
        }*/

        //1~10的和
        /*int sum = 0;
        for (int i = 1; i<= 10; i++){
            sum = sum + i;
            System.out.println("sum = " + sum);
        }

        System.out.println("total_sum = " + sum);*/

        //1~100的偶数和
        /*int sum = 0;
        for (int i = 1; i<= 100; i++){
            if (i % 2 == 0){
                sum = sum + i;
                System.out.println("sum = " + sum);
            }
        }

        System.out.println("total_sum = " + sum);*/

        //1~100的奇数和
        /*int sum = 0;
        for (int i = 1; i<= 100; i++){
            if (i % 2 != 0){
                sum = sum + i;
                System.out.println("sum = " + sum);
            }
        }

        System.out.println("total_sum = " + sum);*/


        /*水仙花数：指一个三位数，其各位数的立方和等于该数的本身
        1、100~999
        2、获取每一个位数的值，百位，十位，个位
        3、判断各个位上的立方和是否等于这个数，如果等于打印
        */
        /*int j = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i){
                j = j + 1;
                System.out.println("i = " + i);
            }
        }
        System.out.println("水仙花数量 j = " + j);*/

        //跳出循环   mark标记
        a: for (int i = 1; i <= 10; i++){       //a是标记，只要是合法的标识符即可
            System.out.println("i = " + i);
            b: for (int j = 1; j <= 10; j++){
                System.out.println("j = " + j);
                break a;                       //表示跳出a循环
            }
        }
    }
}
