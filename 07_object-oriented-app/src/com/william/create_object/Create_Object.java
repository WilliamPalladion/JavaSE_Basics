package com.william.create_object;

/*
public class 类名{
	1. 成员变量 (属性，一般是名词)
	2. 成员方法 (行为，一般是动词)
	3. 构造器
	4. 代码块
	5. 内部类
}
*/
public class Create_Object {
    public static void main(String[] args) {
        // 访问汽车类，创建对象
        Car c = new Car();

        // System.out.println(c.name); // null
        // System.out.println(c.price); // 0.0

        // 为对象的具体属性赋值
        c.name = "宝马";
        c.price = 38.9;
        System.out.println(c.name); // 宝马
        System.out.println(c.price); // 38.9

        // 调用方法
        c.start(); // 宝马启动！
        c.run(); // 宝马的价格是：38.9，跑的很快

        System.out.println("--------------------");

        // 可以创建一个新的对象
        Car c2 = new Car();
        c2.name = "奔驰";
        c2.price = 39.9;
        System.out.println(c2.name);
        System.out.println(c2.price);
        c2.start();
        c2.run();

        System.out.println(c);
        // com.william.create_object.Car@6acbcfc0
        System.out.println(c2);
        // com.william.create_object.Car@5f184fc6

    }
}

/* 注意事项
1）一个Java文件中可以定义多个class类，但只能一个类是public修饰
   且public修饰的类名必须成为代码文件名；
   实际开发中还是建议一个代码文件只定义一个类

Student.java
public class Student{}
class Animal{}
class Dog{}

2）成员变量的完整定义格式是：修饰符 数据类型 变量名 = 初始值;
    e.g. public String name = "william";
   一般无需指定初始化值，存在默认值 (0, 0.0, false, null)
*/
