package com.william.polymorphic;

public class Polymorphic_Demo {
    public static void main(String[] args) {
        // 多态：同类型的对象，执行同一个行为，会表现出不同的行为特征
        // 多态的前提：有继承/实现关系；有父类引用指向子类对象；有方法重写

        // 常见形式：
        // 父类类型 对象名称 = new 子类构造器；
        // 接口 对象名称 = new 子类构造器；

        // 可以理解为把 小范围对象(Dog, Tortoise) 赋给 大范围变量 (Animal)
        // 都是Animal类型的对象，都执行run()行为，但产生不同的行为特征 -> 多态

        /* 多态中成员访问特点：
         1) 方法调用：编译看左边，运行看右边；
         2) 变量调用：编译看左边，运行看左边；(多态侧重于行为多态)
         */

        // 1) 方法调用：编译看左边，运行看右边；
        // 编译时先看Animal类型有没有run()方法，但运行时还是走Dog/Tortoise内的run()方法
        Animal a = new Dog();
        a.run(); // 狗跑得很快

        // 2）变量调用：还是使用父类Animal中的变量
        System.out.println(a.name); // 父类：动物

        Animal a2 = new Tortoise();
        a2.run(); // 乌龟跑得很慢
        System.out.println(a2.name); // 父类：动物


        // 优势：
        // 1）在多态形式下，右边对象可以实现解耦合(代码间依赖关系降低)，便于扩展和维护
        // Animal a = new Dog(); // 如果我们不需要Dog对象，而是要改成Tiger对象
        // a.run(); // 后续业务行为随对象直接改变，代码无需修改

        // 2）定义方法时，使用父类类型作为参数，该方法就可以接收该父类的一切子类对象 (又称：对象回调)
        go(a);
        go(a2);

        // 多态的一个问题：多态下不能使用子类的独有功能 (因为编译阶段会报错)
        // a.lookDoor();

    }

    // 如果定义成Dog/Tortoise那只能接收那一类的对象，Animal就都可
    public static void go(Animal a){
        System.out.println("开始！");
        a.run();
        System.out.println("结束！");
    }
}
