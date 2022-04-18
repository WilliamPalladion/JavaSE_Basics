package com.william.polymorphic;

public class Tortoise extends Animal {
    public String name = "子类：乌龟";
    @Override
    public void run() {
        System.out.println("乌龟跑得很慢");
    }

    // 独有方法
    public void layEggs(){
        System.out.println("乌龟下蛋");
    }
}
