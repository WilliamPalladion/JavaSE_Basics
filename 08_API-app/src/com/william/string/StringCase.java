package com.william.string;

import java.util.Random;
import java.util.Scanner;

public class StringCase {
    public static void main(String[] args) {
        // Case 1: 使用String类的API完成随机生成5位的验证码
        // 定义可能出现的字符信息
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // 循环5次，每次生成一个随机索引，提取对应字符连接起来
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 5; i++) {
            // 随机一个索引
            int index = r.nextInt(data.length());
            char c = data.charAt(index);
            code += c;
        }
        System.out.println(code);

        // Case 2: 模拟用户登录功能，三次机会
        String okName = "admin";
        String okPassword = "william";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入登录名称");
            String loginName = sc.next();
            System.out.println("请您输入登录密码");
            String password = sc.next();

            if (loginName.equals(okName)){
                if (password.equals(okPassword)){
                    System.out.println("登录成功！");
                    break;
                } else {
                    System.out.println("密码不正确！您还剩余" + (3 - i - 1) + "次机会");
                }
            } else {
                System.out.println("登录名错误！您还剩余" + (3 - i - 1) + "次机会");
            }
        }

        // Case 3: 手机号码屏蔽 (188****2468)
        // 以字符串的形式从键盘接收一个手机号，将中间4位号码屏蔽
        System.out.println("请您输入您的收集号码：");
        String tel = sc.next();

        // 截取号码的前三位和后思维
        String before = tel.substring(0, 3);
        String after = tel.substring(7);

        String s = before + "****" + after;
        System.out.println(s);
    }
}
