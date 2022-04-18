package com.william.static_util;

public class CaseDemo {
    public static void main(String[] args) {
        // 1. 调用 toString 工具类
        int[] arr = null;
        int[] arr1 = {};
        int[] arr2 = {12, 22, 44, 99};

        System.out.println(ArraysUtils.toString(arr));
        System.out.println(ArraysUtils.toString(arr1));
        System.out.println(ArraysUtils.toString(arr2));

        System.out.println("------------------------------");

        // 2. 调用 getAverage 工具类
        double[] arr3 = null;
        double[] arr4 = {};
        double[] arr5 = {12, 22, 44, 99};

        System.out.println(ArraysUtils.getAverage(arr3)); // -1.0
        System.out.println(ArraysUtils.getAverage(arr4)); // NaN
        System.out.println(ArraysUtils.getAverage(arr5)); // 44.25

    }
}
