package com.william.scanner;
// import java.util.Scanner
// 并不需要自己手写导包，以后通过IDEA进行导入更方便

import java.util.Scanner;

// Case: 调用API完成程序与用户交互，录入用户输入的名称、年龄

public class ScannerDemo {
    public static void main(String[] args) {
        // 得到一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);

        // 调用sc对象的功能等待接受用户输入的数据
        System.out.println("请输入您的年龄： ");
        int age = sc.nextInt(); // 等待用户输入数据并回车
        System.out.println("请的年龄是： " + age);

        System.out.println("请输入您的姓名： ");
        String name = sc.next();
        System.out.println("欢迎： " + name);
    }
}
