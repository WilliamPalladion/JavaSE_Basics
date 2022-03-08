package com.william.javabean;

public class User {
    // 标准JavaBean的书写要求：
    // 1）成员变量要用 private 修饰；
    // 2）提供成员变量对应成套的 setXxx()/getXxx() 方法；
    // 3）必须提供一个无参构造器；有参构造器可写可不写；
    private String name;
    private double height;
    private double salary;

    // 右击选中 Generate -> 选 Getter and Setter 选中成员变量一键生成
    // 一般不加判断是因为送到后台的数据一般就是合规的
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 有参数构造器也可以用Generate -> Constructor 生成
    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    // 无参数构造器就在参数处选择 Select None
    public User() {
    }
}
