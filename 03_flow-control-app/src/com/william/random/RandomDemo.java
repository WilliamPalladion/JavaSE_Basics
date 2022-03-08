package com.william.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        // Random 类
        Random r = new Random(); // 创建Random对象

        for (int i = 0; i < 10; i++) {
            int data = r.nextInt(10); // 调用nextInt方法返回一个随机数 (0~9)
            System.out.println(data);
        }

        // 若要生成 1~10 的随机数，可以通过加减调整
        // (1-10) ==> -1 ==> (0-9) + 1
        int data = r.nextInt(10) + 1;
        System.out.println(data);

        // (3-17) ==> -3 ==> (0-14) + 3
        int data1 = r.nextInt(15) + 3;
        System.out.println(data1);

        // 或者调用父类的一个方法, e.g. 生成 10 ~ 30 区间的随机数
        int data2 = r.nextInt(10, 31); // 直接指定区间，但注意bound是exclusive的！



        // Case: 猜数字游戏
        // 随机生成一个1~100之间的数字，提示过大或过小，直到猜中结束
        Random rs = new Random();
        int luckyNumber = rs.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in); // 接收用户输入的数字
        // 用一个死循环让用户不断猜测
        while (true) {
            System.out.println("请输入猜测的数据 (1~100): ");
            int guessNumber = sc.nextInt();

            // 判断猜测数据与随机数的大小
            if (guessNumber > luckyNumber){
                System.out.println("数据过大");
            } else if (guessNumber < luckyNumber){
                System.out.println("数据过小");
            } else {
                System.out.println("恭喜猜中！");
                break;
            }
        }

    }
}
