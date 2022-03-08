package com.william.keyword_this;

public class Car {
    String name;
    double price;

    // this 可以出现在构造器中，可以出现在方法中
    public Car(){
        System.out.println("无参数构造器中的this：" + this);
    }

    public void run(){
        System.out.println("方法中的this：" + this);
    }

    // this的作用：用于指定访问当前对象的成员变量、成员方法
    public Car(String name, double price){
        // 这样的写法会导致送进来的值就近赋给了形参变量，而不是我们需要的对象
        // 对象的成员变量的值仍然为默认值
        // name = name;
        // price = price;

        // 我们需要this关键字来指定访问对象的成员变量、成员方法
        this.name = name;
        this.price = price;
    }

    // 同样this出现在成员方法中可以指定对象
    public void goWith(String name){
        System.out.println(this.name + "和" + name + "一起比赛");
    }
}
