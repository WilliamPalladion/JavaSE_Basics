package com.william.encapsulation;

public class EncapsulationDemp {
    public static void main(String[] args) {
        Student s = new Student();
        // s.age; age被private修饰会报错

        s.setAge(23);
        System.out.println(s.getAge()); // 23

        // s.setAge(-23);
        // 年龄数据有问题
        // System.out.println(s.getAge()); // 0
    }
}
