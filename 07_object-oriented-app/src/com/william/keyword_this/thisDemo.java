package com.william.keyword_this;

public class thisDemo {
    public static void main(String[] args) {
        // this 可以出现在构造器/方法中，代表当前对象的地址
        Car c = new Car();
        c.run();
        System.out.println(c);
        /*
        无参数构造器中的this：com.william.keyword_this.Car@6d311334
        方法中的this：com.william.keyword_this.Car@6d311334
        com.william.keyword_this.Car@6d311334
        */

        // this的作用：用于指定访问当前对象的成员变量、成员方法
        Car c2 = new Car("Benz", 39.9);
        System.out.println(c2.name);
        System.out.println(c2.price);

        c2.goWith("BMW"); // Benz和BMW一起比赛
    }
}
