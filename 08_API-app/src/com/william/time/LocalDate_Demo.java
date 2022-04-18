package com.william.time;

import java.time.LocalDate;
import java.time.Month;

/** LocalDate
 * 构造对象 (调用方法)：
 public static LocalDate now(): 根据当前日期创建对象
 public static LocalDate of(...): 指定日期创建对象 (e.g. LocalDate.of(2099, 11, 11))

 * 常用方法：
 getYear(), getMonthValue(), getDayOfMonth();
 getDayOfYear(), getDayOfWeek();
 */

public class LocalDate_Demo {
    public static void main(String[] args) {
        // 获取本地日期对象 (直接调用方法获取对象)
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate); // 2022-04-13

        // 获取年、月、日
        int year = nowDate.getYear();
        System.out.println("year: " + year); // year: 2022

        int month = nowDate.getMonthValue();
        System.out.println("month: " + month); // month: 4

        int day = nowDate.getDayOfMonth();
        System.out.println("day: " + day); // day: 13

        // 当年中的第几天
        System.out.println("Day of Year: " + nowDate.getDayOfYear()); // Day of Year: 103

        // 星期、月份 (以及如何转换成数字形式)
        System.out.println(nowDate.getDayOfWeek()); // WEDNESDAY
        System.out.println(nowDate.getDayOfWeek().getValue()); // 3

        System.out.println(nowDate.getMonth()); // APRIL
        System.out.println(nowDate.getMonth().getValue()); // 4

        // 指定日期创建对象
        LocalDate bt = LocalDate.of(1999, 2, 4);
        System.out.println("birth time: " + bt); // birth time: 1999-02-04

        // 还可以用枚举的方式获取
        System.out.println(LocalDate.of(1999, Month.FEBRUARY, 4));

    }
}
