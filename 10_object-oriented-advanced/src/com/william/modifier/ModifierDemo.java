package com.william.modifier;

public class ModifierDemo {
    public static void main(String[] args) {
        // 权限修饰符：用来控制一个成员能够被访问的范围
        // 可以修饰：成员变量，方法，构造器，内部类

        // 分类&范围(由小到大)：private < 缺省 < protected < public
        // private: 同一个类中
        // 缺省: 同一个类中，同一个包中其他类 (包访问权限)
        // protected: 同一个类中，同一个包中其他类，不同包下的子类
        // public: 同一个类中，同一个包中其他类，不同包下的子类，不同包下的无关类


        Fu f = new Fu();

        // 同一个包的其他类下：
        // f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
