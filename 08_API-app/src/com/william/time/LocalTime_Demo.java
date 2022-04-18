package com.william.time;

import java.time.LocalTime;

/** LocalTime
 * 构造对象 (调用方法)：
 public static LocalTime now(): 根据当前时间创建对象
 public static LocalTime of(...): 指定时间创建对象

 * 常用方法：
 getHour(), getMinute(), getSecond(), getNano()
 isAfter(), ifBefore()
 */

public class LocalTime_Demo {
    public static void main(String[] args) {
        // 获取本地时间对象
        LocalTime nowTime = LocalTime.now();
        System.out.println("现在时间：" + nowTime); // 现在时间：13:28:38.866705700

        // 时、分、秒、纳秒
        int hour = nowTime.getHour();
        System.out.println("hour: " + hour); // hour: 13

        int minute = nowTime.getMinute();
        System.out.println("minute: " + minute); // minute: 28

        int second = nowTime.getSecond();
        System.out.println("second: " + second); // second: 38

        int nanoSecond = nowTime.getNano();
        System.out.println("Nano Second: " + nanoSecond); // Nano Second: 866705700

        System.out.println("----------------------------------");

        // LocalTime.of() 指定时间创建对象
        System.out.println(LocalTime.of(8, 10)); // 08:10 时、分
        System.out.println(LocalTime.of(8, 10, 30)); // 08:10:30 时、分、秒
        System.out.println(LocalTime.of(8, 10, 30, 100)); // 08:10:30.000000100 时、分、秒、纳秒

        // 比较时间前后
        LocalTime Time1 = LocalTime.of(15, 10, 30);
        LocalTime Time2 = LocalTime.of(8, 10, 30);
        System.out.println(nowTime.isBefore(Time1)); // true
        System.out.println(nowTime.isAfter(Time2)); // true
    }
}
