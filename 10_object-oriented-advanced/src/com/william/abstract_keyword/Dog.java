package com.william.abstract_keyword;

// 抽象类的子类一定要完成父类的所有抽象方法重写，否则这个类也必须定义成抽象类
// alt + enter 快捷键 (或者直接 方法名 + 回车)

public class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("狗跑的真快");
    }
}
