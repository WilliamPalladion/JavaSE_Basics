package com.william.modifier.itcast;

import com.william.modifier.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Fu f = new Fu();

        // 不同包下的子类
        // f.privateMethod();
        // f.method();

        // f.protectedMethod();
        // 这里protectedMethod还是报错，为什么呢？
        // 因为这是子类访问权限，不应该再创建父类对象，而应该是子类对象，这样才是权限给到子类
        f.publicMethod();

        // 子类对象就能够成功访问protected/public方法
        Zi zi = new Zi();
        zi.protectedMethod();
        zi.publicMethod();

    }
}
