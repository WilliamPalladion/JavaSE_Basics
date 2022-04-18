package com.william.interface_keyword.interface_jdk8;

// 为了在丰富接口功能的同时又不对子类代码进行更改，JDK 8 后允许接口中直接定义带有方法体的方法

public interface SportManInter {
    // 1. 默认方法
    // 类似实例方法，必须用default修饰 (默认用public修饰)；
    // 默认方法，接口不能创建对象，所以需要用接口的实现类的对象来调用
    default void run(){
        System.out.println("跑得快");
        go(); // 被默认方法调用
    }

    // 2. 静态方法
    // 默认用public修饰，必须用static修饰
    // 注意：接口的静态方法必须用本身的接口名来调用
    static void inAddr(){
        System.out.println("学习源码");
    }

    // 3. 私有方法 (JDK 1.9 开始新增)
    // 私有的实例方法；必须用private修饰
    // 只能在本类中被其他的默认方法或私有方法访问 (因为它是实例方法)
    private void go(){
        System.out.println("开始跑步");
    }
}



class PingPongMan implements SportManInter{
}

class Test{
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();
        // p.go(); 私有化不能被对象调用

        // 接口的静态方法必须用本身的接口名来调用
        SportManInter.inAddr();
    }
}