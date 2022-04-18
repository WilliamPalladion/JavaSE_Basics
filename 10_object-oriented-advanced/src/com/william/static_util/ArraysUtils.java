package com.william.static_util;

/** 开发数组工具类
 * 1. 定义一个工具类方法 toString， 用于返回整数数组的内容
 * 2. 定义一个工具类方法 getAverage，用于返回浮点型数组的平均值
 * 3. 测试这两个工具类方法
 */

public class ArraysUtils {
    // 私有构造器
    private ArraysUtils(){
    }

    // 工具类方法 toString， 用于返回整数数组的内容
    public static String toString(int[] arr){
        if (arr == null){
            return null;
        }

        // 拼接数组
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        result += "]";
        return result;
    }

    // 工具类方法 getAverage，用于返回浮点型数组的平均值
    public static double getAverage(double[] arr){
        if (arr == null){
            return -1;
        }

        if (arr.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double result = (sum) / arr.length;
        return result;
    }
}
