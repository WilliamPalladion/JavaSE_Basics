package com.william.cases;

import java.util.Scanner;

/* Case 5: 评委打分
   6名评委打分，分数范围为 (0-100) 之间的整数；选手最终得分为去掉最高分和最低分后的4个评委的平均分
* */
public class CaseDemo5 {
    public static void main(String[] args) {
        // 动态初始化数组，用于录入评委分数
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请您输入第" + (i + 1) + "个评委的打分：");
            int score = sc.nextInt();
            scores[i] = score;
        }

        // 循环找到最大值、最小值、总分
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        // 注意这个时候不能从1开始，因为还要求和
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max){
                max = scores[i];
            }

            if (scores[i] < min){
                min = scores[i];
            }

            sum += scores[i];
        }
        double average = (sum - max - min) * 1.0 / (scores.length - 2);
        System.out.println("选手最终得分为：" + average);
    }
}
