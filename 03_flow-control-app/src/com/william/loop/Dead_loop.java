package com.william.loop;

import java.util.Scanner;

public class Dead_loop {
    public static void main(String[] args) {
        // 死循环
//        for (;;){
//            System.out.println("Hello World");
//        }

        // 经典写法
//        while (true){
//            System.out.println("Hello World"); // Unreachable, 因为上一个循环是死循环，永远也执行不到这
//        }

//        do {
//            System.out.println("Hello World");
//        } while (true);

        // Case: 密码验证：用户不断输入密码，验证不对输出密码错误，正确输出欢迎进入系统，并停止程序
        int okpassword = 520;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请您输入密码：");
            int password = sc.nextInt();
            // if 判断密码是否正确
            if (password == okpassword){
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("密码错误！");
            }
        }
    }
}
