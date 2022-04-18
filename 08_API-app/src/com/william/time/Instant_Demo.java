package com.william.time;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

/** 11） Instant
 * JDK 8 获取时间戳(年月日时秒分)，且功能非常丰富；
 * Instant类由now()方法返回当前时间戳，与java.util.Date类非常类似，实际上Instant就是类似JDK 8以前的Date
 * Instant和 Date 这两个类可以互相转换: Date.from(instant), date.toInstant()

 * */
public class Instant_Demo {
    public static void main(String[] args) {
        // 获取一个时间戳对象 (注意获取的是格林尼治 UTC+0:00 时间)
        Instant instant = Instant.now();
        System.out.println(instant);
        // 2022-04-14T14:04:54.825561300Z

        // 获取当前时区的真正时间
        System.out.println(instant.atZone(ZoneId.systemDefault()));
        // 2022-04-14T22:04:54.825561300+08:00[Asia/Shanghai]

        // 与Date对象互相转换 (注意：Instant时间戳还是默认UTC+0，但Date会取系统时区时间)
        Date date = Date.from(instant);
        System.out.println(date); // Thu Apr 14 22:07:24 CST 2022

        Instant instant1 = date.toInstant();
        System.out.println(instant1); // 2022-04-14T14:07:24.993Z

    }
}
