package com.william.stringbuilder;

/** StringBuilder
 * 字符串类原本是不可变的，但StringBuilder提供了一个可变的字符串类，相当于只在一个对象容器中操作
 * 作用：提高字符串的操作效率，如拼接、修改等

 * 构造器:
 public StringBuilder(): 创建一个空白的可变字符串对象，不包含任何内容
 public StringBuilder(String str): 创建一个指定内容的可变字符串对象

 * 常用方法：
 public StringBuilder append(任何类型): 添加数据并返回StringBuilder对象本身
 public StringBuilder reverse(): 内容反转
 public int length(): 对象内容长度
 public String toString(): 将StringBuilder转换为String
 * */

public class StringBuilder_Demo {
    public static void main(String[] args) {
        // append()
        StringBuilder sb = new StringBuilder(); // ""
        sb.append("a");
        System.out.println(sb); // a, 说明类内重写了toString()方法

        // 各种类型都支持
        sb.append("bc");
        sb.append(1);
        sb.append(3.3);
        sb.append(false);
        System.out.println(sb); // abc13.3false

        StringBuilder sb1 = new StringBuilder();
        sb1.append("a").append("b").append(10); // 链式编程，每次都返回原对象
        System.out.println(sb1);

        // reverse()
        sb1.reverse().append(110);

        // length()
        System.out.println(sb1.length());

        // 注意StringBuilder只是拼接字符串的手段，效率很高，但最终的结果还是应该恢复成String类型
        // 因为大部分时候Java都是在用String，所以恢复成String会更规范
        StringBuilder sb2 = new StringBuilder();
        sb2.append("a").append("b").append(10);
        // toString()方法
        sb2.toString();
    }
}
