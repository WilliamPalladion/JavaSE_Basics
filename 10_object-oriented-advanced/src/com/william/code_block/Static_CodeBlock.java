package com.william.code_block;

import java.util.ArrayList;

public class Static_CodeBlock {
    // 代码块是类的5大成分之一 (成员变量，构造器，方法，代码块，内部类)，定义在类中方法外

    // 1） 静态代码块: static{}
    // 通过static关键字修饰，随着类的加载而加载 (优先加载)，且自动触发，只执行一次
    // 使用场景：在类加载时做一些静态数据初始化的操作，方便后续使用

    public static String schoolName; // e.g. 学校系统只需要一个学校名字
    public static ArrayList<String> cards = new ArrayList<>(); // e.g. 只需要一副54张牌

    static {
        System.out.println("===========静态代码块被执行============="); // 自动触发，且优先main方法加载
        schoolName = "William School";
        // 系统启动就自动初始化了一副牌
        cards.add("3");
        cards.add("K");
        cards.add("A");
    }

    public static void main(String[] args) {
        System.out.println("===========main方法被执行==============");
        System.out.println(schoolName); // William School
    }
}
