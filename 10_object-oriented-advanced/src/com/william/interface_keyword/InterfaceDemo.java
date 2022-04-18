package com.william.interface_keyword;

// 接口 (interface)：体现一种规范，规范一定是公开的 (public)
// 老版接口 (JDK 8 前): 接口中只能有抽象方法和常量
/*
public interface 接口名{
	// 常量
	// 抽象方法
}
*/
public interface InterfaceDemo {
    // 由于接口提心规范思想，所以 public ... 可以省略不写
    // 常量
    String SCHOOL_NAME = "william";
    // public static final String SCHOOL_NAME = "william";

    // 抽象方法
    void run();
    // public abstract void run();

    void eat();
    // public abstract void eat();
}
