package com.william.polymorphic;

public class Polymorphic_Type {
    public static void main(String[] args) {
        // 多态下引用数据类型的类型转换：
        // 1）自动类型转换 (子类 -> 父类)：小到大，子类对象赋值给父类类型的变量指向；
        // 2）强制类型转换 (父类 -> 子类)：大到小，必须强转
        // 子类 对象变量 = (子类) 父类类型的变量
        // 作用：可以解决多态的劣势，实现调用子类独有的功能

        // 自动类型
        Animal a = new Dog();
        a.run();

        // 强制类型
        Animal a2 = new Tortoise();
        a2.run();
        Tortoise t = (Tortoise) a2; // 父类 -> 子类
        t.layEggs();

        // 注意：如果转型后的类型和对象真实类型不是同一种类型，那么在转换时就会出现ClassCastException
        // Dog d = (Dog) a2;
        // 有继承/实现关系在编译阶段可以强转 (因为确实是父类的类型)，但运行时可能会出错

        // Java建议在强转前使用 instanceof 判断当前对象的真实类型，再进行强转
        // 判断左边的变量指向的对象的真实类型，是否是右边的类型或者其子类类型，是则返回true；
        // 变量名 instanceof 真实类型;
        if (a2 instanceof Tortoise){
            Tortoise t1 = (Tortoise) a2;
            t1.layEggs();
        } else if (a2 instanceof Dog){
            Dog d = new Dog();
            d.lookDoor();
        }

        // 为什么我们需要这种操作来判断？因为有时候你确实不知道是什么类型
        go(new Dog());
        go(new Tortoise());

    }

    public static void go(Animal a){
        a.run();
        // 这时候你怎么知道这个a到底是哪种动物子类？所以我们需要instanceof
        if (a instanceof Tortoise){
            Tortoise t1 = (Tortoise) a;
            t1.layEggs();
        } else if (a instanceof Dog){
            Dog d = new Dog();
            d.lookDoor();
        }
    }
}
