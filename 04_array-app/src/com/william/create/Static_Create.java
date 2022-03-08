package com.william.create;

public class Static_Create {
    public static void main(String[] args) {
        // 静态初始化数组
        // 完整格式: Type[] Name = new Type[] {element1, element2, ...};
        // 简化格式: Type[] Name = {element1, element2, ...};
        // Type[] Name 也可以写成 Type Name[]
        double[] scores = new double[] {99.5, 88.0, 75.5};
        int[] ages = new int[] {12, 24, 36};
        String[] names = new String[] {"张三", "李四"};

        // 底层原理：存储的是数组的地址
        System.out.println(scores); // [D@776ec8df ([ 代表数组，D 代表double类型，@ 表示地址在哪里，后面跟16进制的地址)


        // 数组访问: Name[Index]
        int[] arr = {12, 24, 36}; // index: 0, 1, 2, ...
        System.out.println(arr[0]); // 12

        // 赋值
        arr[2] = 20;
        System.out.println(arr[2]); // 20

        // length属性: arr.length
        System.out.println(arr.length); // 3

        // Note:
        // 1) Type[] Name 也可以写成 Type Name[]
        int age[] = {11, 23, 45};

        // 2) 什么类型的数组放什么类型的数据
        // String[] name = {"william", "data", 23}; 报错

        // 3) 数组一旦定义出来，那么程序执行的过程中，长度、类型就固定了
        int[] age2 = {11, 23, 45};
        // System.out.println(age2[3]); 报错, index out of bound
    }
}
