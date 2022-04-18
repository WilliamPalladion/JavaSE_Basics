package com.william.inner_class.inner_anonymous;

/** 4) 匿名内部类
 * 本质上是一个没有名字的局部内部类，定义在方法、代码块等中；
 * 作用：方便创建子类对象，最终目的是为了简化代码编写
 * 会产生class文件：Filename$number.class (e.g. Test$1.class)

 * 格式：
 new 类/抽象类/接口名() {
    重写方法;
 };

 * 特点：
 1）匿名内部类是一个没有名字的内部类；
 2）匿名内部类写出来就创建了一个匿名内部类的对象；
 3）匿名内部类的对象类型相当于是当前new的类型的子类类型；
 */
public class AnonymousClassDemo {
    public static void main(String[] args) {
        // 注意这个创建的不是Animal类的对象，是匿名内部类的对象
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑得快~~");
            }
        };
        a.run();
    }
}

// 原本我们需要重新定义一个子类来继承重写抽象父类，但匿名内部类就能简化这个过程
//class Tiger extends Animal {
//    @Override
//    public void run() {
//        System.out.println("老虎跑得快~~");
//    }
//}

abstract class Animal {
    public abstract void run();
}

