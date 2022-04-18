package com.william.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** 12） DateTimeFormatter
 * JDK 8 引入的全新的日期与时间格式器；正反都能调用format方法

 * 常用方法：
 DateTimeFormatter.ofPattern();
 format(): 正向逆向均可
 LocalDate.parse(String str, DateTimeFormatter dtf): 解析字符串时间成为LocalDateTime对象
 */

public class DateTimeFormatter_Demo {
    public static void main(String[] args) {
        // 获取一个日期时间对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2022-04-14T22:27:47.497550600

        // 解析/格式化器
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");

        // 正向格式化
        System.out.println(dtf.format(ldt)); // 2022-04-14 22:27:47 周四 下午

        // 逆向格式化
        System.out.println(ldt.format(dtf)); // 2022-04-14 22:27:47 周四 下午

        // 用DateTimeFormatter解析字符串时间成为LocalDateTime对象
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt1 = LocalDateTime.parse("2019-11-11 12:22:30", dtf1);

        System.out.println(ldt1); // 2019-11-11T12:22:30
        System.out.println(ldt1.getYear()); // 2019

    }
}
