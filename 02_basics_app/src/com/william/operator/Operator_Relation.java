package com.william.operator;

public class Operator_Relation {
    public static void main(String[] args) {
        // 4. 关系 (条件) 运算符
        // ==, !=, >, >=, <, <=
        int a = 10;
        int b = 10;
        boolean rs = a == b;

        System.out.println(rs); // true
        System.out.println(a == b); // true
        System.out.println(a != b); // false
        System.out.println(a >= b); // true
        System.out.println(a < b); // false
        System.out.println(a <= b); // true

        System.out.println("----------------------");

        // 如果我们把 == 写成了 =
        int i = 10;
        int j = 5;
        System.out.println(i = j); // 5, 这就变成j赋值给i,再打印i的值
    }
}
