package com.william.single_instance;

public class Test_SingleInstance {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;

        // 看看两个对象是否存储同一个地址，判断是否为单例
        System.out.println(s1 == s2); // true
    }
}
