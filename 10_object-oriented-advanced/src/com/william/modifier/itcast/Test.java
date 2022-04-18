package com.william.modifier.itcast;

import com.william.modifier.Fu;

public class Test {
    public static void main(String[] args) {
        Fu f = new Fu();

        // 其他包的无关类
        // f.privateMethod();
        // f.method();
        // f.protectedMethod(); // 一定要是子类
        f.publicMethod();
    }
}
