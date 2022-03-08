package com.william.memory;

public class Memory {
    public static void main(String[] args) {
        // Java 内存分配
        // 栈、堆、方法区、本地方法栈、寄存区

        // 方法区：字节码文件加载时进入的内存(xx.class文件)
        // 栈内存：方法运行时所进入的内存(main,...), 变量也在这里
        // 堆内存：new产生的对象会在这块内存中开辟空间并产生地址
        int a = 12;
        System.out.println(a);

        int[] arr = new int[] {11, 22, 33}; // 新建arr在栈内存里， new方法产生{11, 22, 33}在堆内存中, arr保存地址
        System.out.println(arr); // [I@776ec8df

        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("-----------------------------------");


        // 两个数组变量指向同一个数组对象
        int[] arr1 = {11, 22, 33};
        int[] arr2 = arr1; // 赋值给的是数组的地址

        System.out.println(arr1); // [I@4eec7777
        System.out.println(arr2); // [I@4eec7777

        arr2[1] = 99;
        System.out.println(arr1[1]); // 99
        System.out.println(arr2[1]); // 99
    }
}
