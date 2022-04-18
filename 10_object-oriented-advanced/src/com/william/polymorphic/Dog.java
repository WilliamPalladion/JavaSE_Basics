package com.william.polymorphic;

public class Dog extends Animal {
    public String name = "子类：狗";
    @Override
    public void run() {
        System.out.println("狗跑得很快");
    }

    // 独有功能
    public void lookDoor(){
        System.out.println("狗会看门");
    }
}
