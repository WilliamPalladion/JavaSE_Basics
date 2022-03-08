package com.william.string;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        // 比对登陆用户名和密码
        // 正确值
        String okName = "william";
        String okPassword = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("登录名：");
        String name = sc.next();
        System.out.println("登录密码：");
        String password = sc.next();

        // 判断用户输入的登陆名和密码与正确内容是否相同
        if (name == okName && password == okPassword){
            System.out.println("登录地址");
        } else {
            System.out.println("用户名或密码错误");
        }
        // 这样的比对会失败，原因是在比对两者的地址，而一个在常量池中，一个在堆内存中
        // i.e. 字符串的内容比较不适合使用 "=="

        // String类提供的 "equals" 比较：只关心内容一致，不关心地址
        // public boolean equals(Object anObject)：精确比较
        // public boolean equalsIgnoreCase(String anotherString)：忽略大小写
        // 语法：String.equals()
        if (name.equals(okName) && password.equals(okPassword)){
            System.out.println("登录地址");
        } else {
            System.out.println("用户名或密码错误");
        }

        // 忽略大小写一般用于验证码业务
        String sysCode = "23AdFh";
        String code1 = "23aDfH";
        System.out.println(sysCode.equals(code1)); // false
        System.out.println(sysCode.equalsIgnoreCase(code1)); // true

    }
}
