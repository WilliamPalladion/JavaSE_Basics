package com.william.single_instance;

public class SingleInstance2 {
    /* 懒汉单例模式：在真正需要对象时，才去创建一个对象 (延迟加载对象)
       设计步骤：1）定义类，将构造器私有 private className(){}
               2) 定义一个静态变量存储一个对象 public static className instance; (没有new一个对象！)
		       3) 提供一个返回单例对象的方法 public static className getInstance(){
											...
											return ...;
										}
    * */

    // 1. 私有化构造器
    private SingleInstance2(){
    }

    // 2. 定义静态成员变量存储单例对象
    // 注意：懒汉单例也需要把对象私有化，防止外部直接调用 className.instance
    private static SingleInstance2 instance;

    // 3. 提供返回单例对象的方法
    public static SingleInstance2 getInstance(){
        // 如果是第一次来拿对象，需要创建对象
        if (instance == null){
            instance = new SingleInstance2();
        }
        return instance; // 如果是第二次进入就会直接返回对象
    }
}
