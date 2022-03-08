package com.william.create;

public class Dynamic_Create {
    public static void main(String[] args) {
        // 动态初始化数组
        // Type[] Name = new Type[length];

        // Case: 存储3个学生的成绩，尚未知道具体分数
        double[] scores = new double[3]; // 初始化时的默认值为：[0.0, 0.0, 0.0]

        // 赋值
        scores[0] = 99.5;
        System.out.println(scores[0]);
        System.out.println(scores[2]);

        // Case: 存储学生的名字
        String[] names = new String[90]; // 引用类型的默认值为null
        names[0] = "迪丽热巴";
        names[2] = "马尔扎哈";
        System.out.println(names[3]); // null

        // 动态初始化默认值

        // 基本类型：byte/short/int/long, char  -> 0
        //         float, double -> 0.0
        //         boolean -> false
        // 引用类型：类，接口，数组，String -> null

        int[] arr = new int[10];
        System.out.println(arr[0]); // 0

        // 尤其注意char，字符数组的元素默认值为0
        char[] chars = new char[10];
        System.out.println(chars[2]); // 会显示一个形似∅字符，但它对应的就是编号0
        System.out.println( (int)chars[2] ); // 我们可以做一个强制类型转换，确实是0

        boolean[] bools = new boolean[10];
        System.out.println(bools[5]); // false

    }
}
