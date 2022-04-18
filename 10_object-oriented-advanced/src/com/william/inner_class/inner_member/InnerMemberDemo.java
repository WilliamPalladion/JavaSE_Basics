package com.william.inner_class.inner_member;

public class InnerMemberDemo {
    public static void main(String[] args) {
        // 2）成员内部类
        // 无static修饰，属于外部类的对象
        // JDK 16 前，成员内部类中不能定义静态成员

        // 创建对象：外部类.内部类 对象名 = new 外部类构造器().new 内部类构造器();
        // Outer.Inner instance = new Outer().new Inner();
        Outer.Inner in = new Outer().new Inner();
        in.setName("test");
        in.show();

        // 访问静态方法
        Outer.Inner.test();

        // Notes：
        // 1）成员内部类可以直接访问外部类的静态成员
        // 2）成员内部类可以直接访问外部类的实例成员：因为必须先有外部类对象，才有成员内部类对象，所以可以直接访问
        System.out.println("-------------------------------------");
        Outer.Inner in2 = new Outer("play").new Inner();
        in2.show();
    }
}
