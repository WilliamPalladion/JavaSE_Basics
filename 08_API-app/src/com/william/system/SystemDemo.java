package com.william.system;

import java.util.Arrays;

/** 5） System

 * System类的功能是通用的，直接用类名调用，所以不能被实例化

 public static void exit(int status): 终止当前运行的Java虚拟机，零是正常终止，非零表示异常终止
 public static long currentTimeMillis(): 返回当前系统的时间毫秒值形式
 public static void arraycopy(原数组，起始索引，目的地数组，起始索引，拷贝个数): 拷贝数组
 */

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始···");
        // System.exit(0); // JVM终止运行，后面的代码都不会被运行
        System.out.println("程序结束···");

        // 从1970-1-1 00:00:00 (C语言的诞生) 到此刻的毫秒值，1s = 1000ms
        long time = System.currentTimeMillis();
        System.out.println(time);

        // 进行时间的计算来做性能分析
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.0 + "s");

        int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
        int[] arr2 = new int[6];
        // [0, 0, 0, 0, 0, 0] -> [0, 0, 40, 50, 60, 0]
        System.arraycopy(arr1, 3, arr2, 2, 3);
        // Arrays.toString()打印array内容
        System.out.println(Arrays.toString(arr2));

    }
}
