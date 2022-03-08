package com.william.variable;

/*
1）变量要先声明才能使用
2）变量声明后，不能存储其他类型的数据
3）变量的范围是从定义开始，到 “}” 截止，且在同一范围内部不能有重名变量
4）变量定义时可以没有初始值，但使用时必须给初始值
*/

public class VariableNote {
    public static void main(String[] args) {
        // 变量的注意事项
        int a = 22;
        System.out.println(a);

        // a = 1.5; Error: other type data

        // 变量的范围是从定义开始，到 “}” 截止，且在同一范围内部不能有重名变量，见下例
        {
            int b = 25;
            System.out.println(b);
            // int b = 200; error
        }
        // System.out.println(b); Error: cannot find variable "b"
        System.out.println(a); // variable "a" is no problem

        a = 200; // 注意这是赋值！不是定义！

        // 变量定义时可以没有初始值，但使用时必须给初始值
        int c;
        // System.out.println(c); Error: no value is given to variable "c"
        c = 12;
        System.out.println(c);

        // ASCII 编码表
        // e.g. 'a' = 97
        char ch = 'a';
        System.out.println(ch + 1); // 98
        System.out.println(a); // a

        // 0B/0b、 0、  0X/0x 开头代表2/8/16进制
        int i1 = 0B01100001;
        System.out.println(i1); // 二进制的97

        int i2 = 0141;
        System.out.println(i2); // 八进制的97

        int i3 = 0x61;
        System.out.println(i3); // 十六进制的97
    }
}
