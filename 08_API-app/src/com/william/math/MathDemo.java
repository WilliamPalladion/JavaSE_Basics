package com.william.math;

/** 4） Math

 * Math类是一个工具类(类中都是静态static方法)，只提供基本数学运算的方法，没有提供公开的构造器；

 public static int abs(int a): 绝对值
 public static double ceil(double a): 向上取整
 public static double floor(double a): 向下取整
 public static int round(float a): 四舍五入
 public static int max(int a, int b): 两个int值中较大的值
 public static double pow(double a, double b): a^b
 public static double random(): 返回范围为[0.0, 1.0)的随机值
 */

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(10.5));
        System.out.println(Math.abs(-12.6));

        System.out.println(Math.ceil(-12.6));
        System.out.println(Math.floor(12.3));

        System.out.println(Math.pow(2.3, 4.5));

        // round看小数点后第一位
        System.out.println(Math.round(4.49999)); // 4
        System.out.println(Math.round(4.50001)); // 5

        // [0.0, 1.0)
        System.out.println(Math.random());

        // [3, 9) -> [0, 6) + 3 -> [0, 1) * 6 + 3
        System.out.println(Math.random() * 6 + 3);
    }
}
