package com.william.inner_class.inner_static;

public class InnerClassDemo {
    public static void main(String[] args) {
        // 1）静态内部类
        // 创建对象：外部类.内部类 对象名 = new 外部类.内部类构造器();
        // Outer.Inner instance = new Outer.InnerConstructor();
        Outer.Inner in = new Outer.Inner();
        in.setName("william");
        in.show();

        // Notes:
        // 1) 静态内部类可以直接访问外部类的静态成员
        // 2) 静态内部类不可以直接访问外部类的实例成员：外部类的实例成员必须用外部类对象访问

    }
}
