package com.william.common_api.api_object;

import java.util.Objects;

public class Student {
    private String name;
    private char sex;
    private int age;

    // 重写 toString() 方法
    // Generate.../直接打 toString 快捷生成
    @Override
    public String toString(){
        return "Student {name = " + name + ", sex = " + sex + ", age = "
                + age + "}";
    }

    // 重写 equals() 方法：可以子类自己定制比较规则
    // s1.equals(s2) ==> s1 -> this, s2 -> o (多态)
    /*
    @Override
    public boolean equals(Object o){
        // 判断 o 是不是 Student 类型
        if (o instanceof Student){
            // 记得要强转类型，这样才能调用子类Student独有的功能(成员)
            Student s2 = (Student) o;
            // 判断两个对象的内容是否一样
            *//*
            if (this.name.equals(s2.name) &&
                    this.sex == s2.sex && this.age == s2.age) {
                return true;
            } else {
                return false;
            }
            *//*
            return this.name.equals(s2.name) &&
                    this.sex == s2.sex && this.age == s2.age;
        } else {
            // 只能同类型，否则肯定是false
            return false;
        }
    }
    */

    // Generate 直接生成
    @Override
    public boolean equals(Object o) {
        // 判断是否是同一个对象
        if (this == o) return true;
        // 如果o是null / 取类型不相同 => 返回false
        if (o == null || getClass() != o.getClass()) return false;
        // 说明o是Student类型且不为null
        Student student = (Student) o;
        return sex == student.sex && age == student.age && Objects.equals(name, student.name);
        // 这里官方用了Objects.equals()方法来比较两个对象的字符串，这是因为更加安全
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
