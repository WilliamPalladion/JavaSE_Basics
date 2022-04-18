package com.william.inheritance;

/** 继承的特点：
 * 1）子类可以继承父类的属性和行为，但不能继承父类的构造器；
 * 2）Java是单继承模式：一个类只能继承一个直接父类；
 * 3）Java不支持多继承，但支持多层继承；
 * 4）Java中所有类都是Object类的子类
 */

public class Notes {
    public static void main(String[] args) {
        // 1. 子类不能继承父类的构造器
        // 2. 子类是否可以继承父类的私有成员? 可以，但不能直接访问！(有争议，有些材料认为是不能继承，但子类中也有父类空间，只是不能直接访问)
        Tiger t = new Tiger();
        t.eat(); // 可以继承公开方法

        // 3. 子类是否可以继承父类的静态成员? 这只能说是共享，并非继承 (有争议)
        System.out.println(Tiger.location);

        // 4. 单继承模式：一个类只能继承一个直接父类；可以反证为什么不支持：一旦两个父类中有同名的方法，又输出不同的结果，就会冲突
        // 5. 不支持多继承，但支持多层继承；这时候如果有同名方法，优先选择使用最直系的父类 (A -> B -> C，C优先选用B类的同名方法)
        // 6. Java中所有类，要么直接继承Object，要么默认继承Object，要么间接继承了Object，Object是祖宗类
    }
}

class Animal{
    public void eat(){
        System.out.println("吃东西");
    }

    public static String location = "长隆动物园";
}

class Tiger extends Animal{

}