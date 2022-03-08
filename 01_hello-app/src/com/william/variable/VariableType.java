package com.william.variable;

public class VariableType {
    public static void main(String[] args) {
        // 1. byte 字节型，占一个字节， -128~127
        byte number = 98;
        System.out.println(number);

        // byte number = 128; 报错！

        // 2. short 短整型，占两个字节
        short money = 30000;

        // 3. int 整形（默认），占4个字节
        int it = 232442442;

        // 4. long 长整型，占8个字节
        long lg = 133244244;
        // 注意：随便写一个整数字面量会默认成int类型，如132223243244244虽然没有超过long类型的范围，但超过了int类型的范围还是报错
        // 如果要写一个long类型的大数字，需要在其后加 l/L
        long lg2 = 132223243244244L;


        // 5. float, 单精度， 占4个字节
        // 注意：会默认为double类型，需要加上 F/f
        float score = 98.5F;

        // 6. double, 双精度，占8个字节
        double score2 = 999.99;

        // 7. char 字符类型
        char ch = 'a';
        char ch2 = '中';
        // char ch3 = '中国'; 字符只能有一个，否则就是String

        // 8. boolean 布尔类型
        boolean rs = true;
        boolean rs2 = false;

        System.out.println("---------------引用数据类型---------------------");
        String name = "东海帝皇";
        System.out.println(name);

    }
}
