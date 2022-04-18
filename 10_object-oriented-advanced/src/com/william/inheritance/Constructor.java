package com.william.inheritance;


public class Constructor {
    public static void main(String[] args) {
        // 继承后子类构造器的特点：
        // 子类中所有的构造器都会默认先访问父类中无参的构造器，再执行自己
        // 因为子类在初始化时可能会用到父类中的数据，如果父类没有初始化，子类将无法使用父类的数据

        Dog1 d1 = new Dog1();
        // 父类Animal无参数构造器被调用
        // 子类Dog无参数构造器被调用

        System.out.println("=============================");
        Dog1 d2 = new Dog1("金毛"); // 子类有参构造器也会先调用父类的无参构造器
        // 父类Animal无参数构造器被调用
        // 子类Dog有参数构造器被调用
    }
}

class Animal1 {
    public Animal1(){
        System.out.println("父类Animal无参数构造器被调用");
    }
}

class Dog1 extends Animal1 {
    // 子类构造器的第一行语句默认都是 super(), 不写也默认存在
    public Dog1(){
        super();
        System.out.println("子类Dog无参数构造器被调用");
    }

    public Dog1(String name){
        super();
        System.out.println("子类Dog有参数构造器被调用");
    }
}
