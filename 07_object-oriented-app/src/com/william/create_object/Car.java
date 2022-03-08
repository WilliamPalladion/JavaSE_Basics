package com.william.create_object;

public class Car {
    // 成员变量
    String name;
    double price;

    // 成为行为
    public void start(){
        System.out.println(name + "启动！");
    }

    public void run(){
        System.out.println(name + "的价格是：" + price + "，跑的很快");
    }
}
