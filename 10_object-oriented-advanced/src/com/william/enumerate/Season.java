package com.william.enumerate;

/* 枚举是一种特殊的类，它有有限个不同的实例对象 (又称多类模式)， 主要是为了做信息的标志与分类

格式:    修饰符 enum 枚举名称{
            第一行罗列枚举类实例的名称
        }
*/

public enum Season {
    // 枚举的第一行必须罗列枚举类所有对象的名称 (也称多例)，建议全部大写
    SPRING, SUMMER, AUTUMN, WINTER;
}

// 枚举类javap反编译的结果如下：
// 枚举类的特征：1) 枚举类都继承了枚举类型 java.lang.Enum
//            2) 枚举类都是final类，不可以被继承
//            3) 枚举类的构造器都是私有的，枚举类对外不能创建对象
//            4) 枚举类的第一行默认罗列枚举对象的名称，且都是常量
/*
public final class Season extends java.lang.Enum<Season> {
    public static final Season SPRING = new Season();
    public static final Season SUMMER = new Season();
    public static final Season AUTUMN = new Season();
    public static final Season WINTER = new Season();
    public static Season[] values();
    public static Season valueOf(java.lang.String);
}
*/
