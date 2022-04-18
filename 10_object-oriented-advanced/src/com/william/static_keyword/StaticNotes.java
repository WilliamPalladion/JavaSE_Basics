package com.william.static_keyword;

public class StaticNotes {
    public static int onlineNumber = 10;
    private String name;

    // 1）静态方法只能访问静态的成员，不能直接访问实例成员；
    public static void test2(){
        System.out.println("====test====");
    }

    public void run(){
        System.out.println(name + "跑的快");
    }

    public static void test(){
        System.out.println(onlineNumber); // 访问静态变量
        test2(); // 访问静态方法

        // run();
        // System.out.println(name); // 不能直接访问实例成员
        // 但可以通过创建对象来间接访问
        StaticNotes s = new StaticNotes();
        System.out.println(s.name);
    }

    // 2）实例方法可以访问静态的成员，也可以访问实例成员；
    public void go(){
        System.out.println(onlineNumber); // 访问静态变量
        test2(); // 访问静态方法
        run(); // 访问实例方法
        System.out.println(name); // 访问实例变量
        System.out.println(this); // 可以用this
    }

    // 3）静态方法中不可以出现this关键字
    public static void test3(){
        // System.out.println(this); // 报错, this代表当前对象，而静态方法不一定会需要对象
    }


    public static void main(String[] args) {

    }
}
