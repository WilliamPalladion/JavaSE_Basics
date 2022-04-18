package com.william.constant;

public class Constant_Demo {
    public static final String SCHOOL_NAME = "St. Johns School";
    public static final String USER_NAME = "admin";
    public static final String PASSWORD = "123456";

    public static void main(String[] args) {
        // 常量：用 public static final 修饰的成员变量，必须有初始化值，而且执行过程中其值不能被改变
        // 作用和好处：常量可以用于做系统的配置信息，方便程序的维护，提高可读性 (e.g. 要修改某一个量，不用到处去找，只要改一处就行)
        // 常量命名规范：英文全部大写，多个单词下划线连接
        System.out.println(SCHOOL_NAME);

        if (USER_NAME.equals("admin")){
            System.out.println("登陆成功");
        }
    }
}
