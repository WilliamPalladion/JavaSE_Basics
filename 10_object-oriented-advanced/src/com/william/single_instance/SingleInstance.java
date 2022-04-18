package com.william.single_instance;

// 设计模式 (Design Pattern): 开发过程中一个问题有n种解法，但肯定有一种最优解，这个最优解被人总结出来称为设计模式

public class SingleInstance {
    // 单例模式：保证系统中，应用该模式的这个类永远只有一个实例 (i.e. 一个类永远只能创建一个对象)
    // 饿汉单例模式：在用类获取对象时，对象已经提前为你创建好了
    // 设计步骤：1）定义类，将构造器私有 private className(){}
    //         2) 定义一个静态变量存储一个对象 public static className instance = new className();

    // 1. 私有化构造器
    // 如果不私有，外部可以无限调用构造器创建对象，显然不合理
    private SingleInstance(){
    }

    // 2. 提前准备对象
    // 因为这个对象只能是1个，所以我们定义静态成员变量static，加载类时同步加载
    public static SingleInstance instance = new SingleInstance();

}
