package com.william.branch;

public class If_Branch {
    public static void main(String[] args) {
        // Case: 心跳 60 ~ 100 为正常，否则提示进一步检查
        // 格式1：if (条件表达式) { 语句体; }
        int heartBeat = 30;
        if (heartBeat < 60 || heartBeat > 100) {
            System.out.println("您的心跳数据是：" + heartBeat + "，需要进一步检查");
        }
        // 如果只有一行可以省略 {}
        System.out.println("检查结束");

        // 格式2：if (条件表达式) { 语句体; } else { 语句体; }
        // Case: 发红包
        double money = 5999;
        // 发送一个1314
        if (money >= 1314) {
            System.out.println("发送红包成功！");
        } else {
            System.out.println("余额不足！");
        }

        // 格式3：if (条件表达式) { 语句体; } else if (条件表达式) { 语句体; }...else { 语句体; }
        // Case: 绩效系统 0-60 C 60-80 B 80-90 A 90-100 A+
        int score = 90;
        if (score >= 0 && score < 60) {
            System.out.println("您本月的绩效为：C");
        } else if (score >= 60 && score < 80) {
            System.out.println("您本月的绩效为：B");
        } else if (score >= 80 && score < 90) {
            System.out.println("您本月的绩效为：A");
        } else if (score >= 90 && score <= 100) {
            System.out.println("您本月的绩效为：A+");
        } else {
            System.out.println("非正常录入");
        }
    }
}
