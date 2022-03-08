package com.william.constructor;

public class Constructor_Create {
    public static void main(String[] args) {
        // 构造器：定义在类中可以用于初始化一个类的对象，并返回对象的地址

        // 无参数构造器：(默认存在) 初始化对象时，成员变量均采用默认值
        Car c = new Car();
        // ===无参数构造器被调用了===
        System.out.println(c.name); // null
        System.out.println(c.price); // 0.0

        // 有参数构造器：初始化对象时可以接收参数为对象进行赋值
        Car c2 = new Car("奔驰", 39.8);
        // ===有参数构造器被调用了===
        System.out.println(c2.name); // 奔驰
        System.out.println(c2.price); // 39.8

        /* Note:
           1）任何类构造出来，默认就自带了无参数构造器，写不写无所谓
           2）一旦定义了有参数构造器，那么无参数构造器就没有了，想要用无参数构造器，必须要手写一个
        */
    }
}
