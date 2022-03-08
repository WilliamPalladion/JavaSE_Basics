package com.william.encapsulation;

public class Student {
    // 一般建议对成员变量使用 private 关键字进行修饰 (private修饰的成员只能在当前类中访问)
    private int age;

    // 同时为每个成员变量提供配套的 public 修饰的 getter/setter 方法暴露其取值和赋值
    public void setAge(int age){
        if (age >= 0 && age <= 200){
            this.age = age;
        } else {
            System.out.println("年龄数据有问题");
        }
    }

    public int getAge(){
        return age; // 因为在同一个类中，所以可以直接访问
    }
}
