package com.william.inheritance;

public class Field_Method {
    public static void main(String[] args) {
        // 继承后：成员变量/方法的访问特点：
        // 1）在子类方法中访问成员满足：就近原则 => 子类局部范围找 -> 子类成员范围找 -> 父类成员范围找，若没有就报错
        Dog d = new Dog();
        d.run(); // 会就近调用子类：狗跑得贼快！
        d.lookDoor();

        d.showName(); // 调用局部name: 局部名 (除非用this指定当前对象) -> 若没有，狗名 -> 还没有，动物名

        // super -> 指定调用父类的成员变量/方法
    }
}

class AnimalDemo{
    public String name = "动物名";
    public void run(){
        System.out.println("动物可以跑");
    }
}

class Dog extends AnimalDemo{
    public String name = "狗名";
    public void lookDoor(){
        System.out.println("狗可以看门");
    }

    public void run(){
        System.out.println("狗跑得贼快！");
    }

    public void showName(){
        String name = "局部名";
        System.out.println(name); // 局部名
        System.out.println(this.name); // 狗名
        System.out.println(super.name); // super -> 调用父类的成员变量/方法: 动物名

        super.run(); // 父类的run方法
        run(); // 子类的run方法
    }
}