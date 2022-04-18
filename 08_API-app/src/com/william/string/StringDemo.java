package com.william.string;

public class StringDemo {
    public static void main(String[] args) {
        // String类常被称为 不可变字符串类型，它的对象在创建后不能被更改
        String name = "传智";
        name += "教育";
        name += "中心";
        System.out.println(name); // 传智教育中心
        // 以 "" 方式给出的字符串对象，在字符串常量池中存储 (堆内存中)，因此变量name存储的其实是对象的地址
        // 但这里特殊的点在于println打印出来就是字符串对象而不是地址，这是因为中间还涉及了其他转换，在后期继承的部分会深入解释
        // 为什么我们还是说它是不可变字符串类型？ 因为 "传智", "教育", "中心" 三个字符串对象都在字符串常量池中没有改变
        // 但每一次运算过后，name就会指向一个新的 += 运算过后的对象："传智" -> "传智教育" (堆内存) -> "传智教育" (堆内存)
        // i.e. 对象没有改变，但变量会不断指向新的对象，String变量每次的修改其实都是产生并指向了新的字符串对象

        /*
        创建字符串对象的方式
        1) 直接使用 "" 定义 (推荐);
        2) 通过String类的构造器创建对象:

        public String(): 创建一个空白字符串对象，无内容
        public String(String original): 根据传入的字符串内容创建对象
        public String(char[] chs): 根据字符数组的内容创建对象
        public String(byte[] chs): 根据字节数组的内容创建对象
        */
        String name1 = "william";
        System.out.println(name1);

        String s1 = new String(); //
        String s2 = new String("test"); // test

        char[] chars = {'a', 'b', '2'};
        String s3 = new String(chars); // ab2

        byte[] bytes = {97, 98, 99, 65, 66, 67};
        String s4 = new String(bytes);
        System.out.println(s4); // // abcABC

        // 两种生成方式的区别：
        // 以 "" 方式给出的字符串对象，在字符串常量池中存储，且相同内容只会存储一份(节省内存资源)
        // 通过构造器new对象，每new一次都会产生一个新的对象，放在堆内存中
        String ss1 = "abc";
        String ss2 = "abc";
        System.out.println(ss1 == ss2); // true, 这里比较的应该是两个变量存储的地址，应该是一样的

        char[] chars1 = {'a', 'b', 'c'};
        String ss3 = new String(chars1);
        String ss4 = new String(chars1);
        System.out.println(ss3 == ss4); // false，这里每个构造器都产生了一个新的对象，所以是不一样的


    }
}
