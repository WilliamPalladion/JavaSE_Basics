package com.william.cases;

import java.util.Random;
import java.util.Scanner;

/* Case 7: 双色球系统
   投注号码：6个红色球号码 (1~33) + 1个蓝色球号码 (1~16)
   注意：6个红球号码要求不能重复
*/
public class CaseDemo7 {
    public static void main(String[] args) {
        int[] luckyNumbers = createLuckyNumber();
        printArray(luckyNumbers);

        int[] userNumbers = userInputNumbers();
        printArray(userNumbers);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int[] createLuckyNumber(){
        int[] numbers = new int[7];
        Random r = new Random();
        // 先遍历前6个位置，生成6个不重复的号码 (1~33)
        for (int i = 0; i < numbers.length - 1; i++) {
            // 不重复 -> 死循环
            while (true) {
                int data = r.nextInt(33) + 1;
                // 判断当前这个号码是否出现过，直到不重复
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == data){
                        // data重复
                        flag = false;
                        break;
                    }
                }
                if (flag == true){
                    numbers[i] = data;
                    break;
                }
            }
        }
        // 第7个位置 (1 - 16)
        numbers[numbers.length - 1] = r.nextInt(16) + 1;
        return numbers;
    }

    public static int[] userInputNumbers(){
        int[] numbers = new int[7];
        // 录入红球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("请您输入第" + (i + 1) + "个红球号码 (1-33)：");
            int data = sc.nextInt();
            numbers[i] = data;
        }
        // 单独录入蓝球号码
        System.out.println("请您输入蓝球号码 (1-16): ");
        numbers[6] = sc.nextInt();

        return numbers;
    }

    // 判断是否中奖
    public static void judge(int[] luckyNumbers, int[] userNumbers){
        int redHit = 0;
        int blueHit = 0;

        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckyNumbers.length - 1; j++) {
                // 号码命中
                if (userNumbers[i] == luckyNumbers[j]){
                    redHit++;
                    break;
                }
            }
        }
        // 蓝球是否命中
        blueHit = userNumbers[6] == luckyNumbers[6] ? 1 : 0;

        System.out.println("中奖号码是：");
        printArray(luckyNumbers);
        System.out.println("您的投注号码是：");
        printArray(userNumbers);
        System.out.println("您命中的红球个数为：" + redHit);
        System.out.println("您是否命中蓝球：" + (blueHit == 1 ? "是" : "否"));

        if (blueHit == 1 && redHit < 3){
            System.out.println("恭喜您，中奖5元");
        } else if(blueHit == 1 && redHit == 3
                || blueHit == 0 && redHit == 4){
            System.out.println("恭喜您，中奖10元");
        } else if(blueHit == 1 && redHit == 4
                 || blueHit == 0 && redHit == 5) {
            System.out.println("恭喜您，中奖200元");
        } else if(blueHit == 1 && redHit == 5) {
            System.out.println("恭喜您，中奖3000元");
        } else if(blueHit == 0 && redHit == 6) {
            System.out.println("恭喜您，中奖500万元");
        } else if(blueHit == 1 && redHit == 6) {
            System.out.println("恭喜您，中奖1000万元");
        } else {
            System.out.println("很遗憾，您没有中奖");
        }
    }
}
