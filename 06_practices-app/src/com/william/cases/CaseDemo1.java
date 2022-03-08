package com.william.cases;

import java.util.Scanner;

/* Case 1：机票价格按照淡季/旺季，头等舱/经济舱收费，输入机票原价、月份和舱位
*          按照如下规则计算机票价格：旺季(5-10月) 头等舱9折，经济舱8.5折；淡季(11-4月) 头等舱7折，经济舱6.5折
*/
public class CaseDemo1 {
    public static void main(String[] args) {
        // 录入购买信息，调用方法获得最终结果
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的机票原价：");
        double price = sc.nextDouble();
        System.out.println("请输入您的机票月份：");
        int month = sc.nextInt();
        System.out.println("请输入您的舱位：");
        String type = sc.next();

        double rs = TicketPrice(price, month, type);
        System.out.println("您当前购买的机票价格为：" + rs);

    }

    public static double TicketPrice(double money, int month, String type){
        // 判断淡季旺季
        if (month >=5 && month <= 10){
            // 舱位switch
            switch (type){
                case "经济舱":
                    money *= 0.85;
                    break;
                case "头等舱":
                    money *= 0.9;
                    break;
                default:
                    System.out.println("您输入的舱位不正确！");
                    money = -1; // 无法计算价格
            }

        } else if (month == 11 || month == 12 || month >=1 && month <= 4){
            switch (type) {
                case "经济舱":
                    money *= 0.65;
                    break;
                case "头等舱":
                    money *= 0.7;
                    break;
                default:
                    System.out.println("您输入的舱位不正确！");
                    money = -1; // 无法计算价格
            }
        } else {
            System.out.println("月份输入有问题！");
            money = -1;
        }
        return money;
    }
}
