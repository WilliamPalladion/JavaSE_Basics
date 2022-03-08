package com.william.type;

public class TypeChange {
    public static void main(String[] args) {
        // 1. 自动类型转换
        // 类型范围小的变量，可以直接赋值给类型范围大的变量
        byte a = 20;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        // byte -> short -> int -> long -> float -> double
        int age = 23;
        double db = age;
        System.out.println(db); // 23.0 (double要带小数)

        // char -> int
        char ch = 'a'; // 00000000 01100001
        int code = ch; // 00000000 00000000 00000000 01100001
        System.out.println(code); // 这里会print 'a' 的ASCII编码数 97，因为code现在是int类型变量

        // 2. 表达式的自动类型转换
        // # byte/short/char -> int -> long -> float -> double
        byte a1 = 10;
        int b1 = 20;
        double c1 = 1.0;

        // 表达式的最终结果类型由表达式中的最高类型决定
        double rs = a1 + b1 + c1;
        System.out.println(rs); // double 31.0

        double rs2 = a1 + b1 - 2.3;
        System.out.println(rs2); // double 27.7

        // 表达式中，byte/short/char 是直接转换成int类型参与运算的
        byte i = 10;
        byte j = 20;
        int k = i + j; // 如果是 byte k = i + j; 就会报错
        System.out.println(k);


        // 3. 强制类型转换
        // DataType var2 = (DataType) var1/data
        int a2 = 20;
        byte b2 = (byte) a2;
        System.out.println(a2); // 20
        System.out.println(b2); // 20

        // 失效情况: 强制类型转换造成数据(丢失)溢出
        int i1 = 1500;
        byte j1 = (byte) i1; // alt + enter 强制转换快捷键
        System.out.println(j1); // -36

        // 浮点型强转为整形，直接丢掉小数部分，保留整数部分返回
        double score = 99.5;
        int it = (int) score;
        System.out.println(it); // 99
    }
}
