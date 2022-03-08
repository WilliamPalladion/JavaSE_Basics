package com.william.cases;

import java.util.Random;
import java.util.Scanner;

public class CaseDemo {
    public static void main(String[] args) {
        // Case 1: 颜值分数求最大值
        int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};
        int max = faceScores[0]; // 建议取第一个值为最大值的初始值

        // 直接从index=1开始遍历
        for (int i = 1; i < faceScores.length; i++) {
            if (max < faceScores[i]){
                max = faceScores[i];
            }
        }
        System.out.println("最大值为：" + max);


        // Case 2: 猜数字游戏
        // 随机生成1-20之间的5个数（可重复），未猜中提示并继续，猜中恭喜，并输出改数据第一次出现的位置，且输出全部5个数据，结束游戏
        int[] data = new int[5];

        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(20) + 1;
        }
        // 用死循环让用户猜测
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("输入1-20之间的整数进行猜测");
            int guessData = sc.nextInt();
            
            // 遍历数组来确认是否有数据与猜测的相同
            for (int i = 0; i < data.length; i++) {
                if (data[i] == guessData){
                    System.out.println("猜对了！该数据的索引为：" + i);
                    break OUT; // 结束整个死循环
                }
            }
            System.out.println("当前猜测的数据在数据中不存在，请重新猜测！");
        }
        // 输出数组的所有元素
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }



        // Case 3: 随机排名
        // 5名人员进行项目汇报，现采取随机排名后进行汇报
        int[] codes = new int[5];

        Scanner sc1 = new Scanner(System.in);
        // 遍历数组来动态录入工号
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请您输入第" + (i+1) + "个员工的工号");
            int code = sc1.nextInt();
            codes[i] = code;
        }
        // 遍历元素，随机一个索引，让元素与随机索引处的元素交换
        Random r1 = new Random();
        for (int i = 0; i < codes.length; i++) {
            int index = r1.nextInt(codes.length);
            // 准备一个临时变量来交换
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }

        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");
        }


        // Case 4: 数组排序
        // 冒泡排序：每次找出数组中的最大值放到数组的后面去
        // 确定需要做几轮：数组长度 - 1;  每一轮比较几次：第 i 轮比较 (数组长度 - i) 次
        int[] arr = {5, 2, 3, 1};
        //           0, 1, 2, 3

        // 定义一个循环控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            // i == 1, 比较 3 次, j = 0 1 2
            // i == 2, 比较 2 次, j = 0 1
            // i == 3, 比较 1 次, j = 0
            // 定义一个内部循环控制每轮比较的次数，同时占位
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 判断是否arr[j] > arr[j + 1], true则交换元素
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }


    }
}
