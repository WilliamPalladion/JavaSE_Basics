package com.william.javabean;

public class JavaBean_Demo {
    public static void main(String[] args) {
        // 1. 无参数构造器创建对象封装一个用户信息
        User u1 = new User();
        // 调用set方法封装信息
        u1.setName("william");
        u1.setHeight(182.5);
        u1.setSalary(1000000);

        // 调用get方法输出信息
        System.out.println(u1.getName()); // william
        System.out.println(u1.getHeight()); // 182.5
        System.out.println(u1.getSalary()); // 1000000.0

        // 2. 有参数构造器创建对象封装一个用户信息
        User u2 = new User("武大郎", 156, 30000);
        System.out.println(u2.getName()); // 武大郎
        System.out.println(u2.getHeight()); // 156.0
        System.out.println(u2.getSalary()); // 30000.0
    }
}
