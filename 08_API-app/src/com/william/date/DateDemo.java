package com.william.date;

import java.util.Date;

/** 7） Date
 * Date类的对象在Java中代表当前所在系统的此刻日期时间

 * 构造器：
 public Date(): Date对象，代表系统当前此刻日期时间
 public Date(long time): 把时间毫秒值转成Date日期对象

 * 常用方法：
 public long getTime(): 获取时间对象的毫秒值 (1970-01-01 ~ now)
 public void setTime(long time): 设置日期对象的时间为当前时间毫秒值对应的时间
 */
public class DateDemo {
    public static void main(String[] args) {
        // 1. 获取当前日期时间
        Date d = new Date();
        System.out.println(d);
        // Wed Apr 13 12:12:29 CST 2022 (明显是重写了方法)

        // 2. 获取时间对象的毫秒值
        long time = d.getTime();
        System.out.println(time);
        // 1649823149858

        // 3. 时间毫秒值 -> 日期对象
        // Case: 计算当前时间往后走1小时121秒后的时间
        Date d1 = new Date();
        System.out.println(d1); // 当前时间, Wed Apr 13 12:21:42 CST 2022

        long time2 = System.currentTimeMillis();
        time2 += (60 * 60 + 121) * 1000;

        // Method 1:
        Date d2 = new Date(time2);
        System.out.println(d2); // Wed Apr 13 13:23:43 CST 2022

        // Method 2:
        Date d3 = new Date();
        d3.setTime(time2);
        System.out.println(d3); // Wed Apr 13 13:23:43 CST 2022
    }
}
