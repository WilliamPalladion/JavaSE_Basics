package com.william.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/** 13） Duration/Period
 * java.time.Period: 计算日期间隔差异，主要用于 LocalDate 之间的比较
 * 主要方法： getYears, getMonths, getDays, between

 * java.time.Duration: 计算时间间隔差异，主要用于 LocalDateTime/Instant 之间的比较
 * 主要方法：between, toDays, toHours, toMinutes, toMillis, toNanos
 */

public class Period_Duration_Demo {
    public static void main(String[] args) {
        // 1. Period
        // 获取一个LocalDate 年月日对象
        LocalDate today = LocalDate.now();
        System.out.println(today); // 2022-04-14

        // 生日的年月日
        LocalDate birthDate = LocalDate.of(1999, 2, 4);
        System.out.println(birthDate); // 1999-02-04

        // between(): 间隔的时间，第二个参数减第一个
        Period period = Period.between(birthDate, today);
        System.out.println(period); // P23Y2M10D

        // 获取Period对象的属性
        System.out.println(period.getYears()); // 23
        System.out.println(period.getMonths()); // 2
        System.out.println(period.getDays()); // 10

        System.out.println("-----------------------------");

        // 2. Duration
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2022-04-14T22:57:04.097103400
        LocalDateTime birthDT = LocalDateTime.of(1999, 2, 4, 20, 50, 30);
        System.out.println(birthDT); // 1999-02-04T20:50:30

        Duration duration = Duration.between(birthDT, ldt);

        System.out.println(duration.toDays()); // 8470
        System.out.println(duration.toHours()); // 203282
        System.out.println(duration.toMinutes()); // 12196926
        System.out.println(duration.toMillis()); // 731815594097
        System.out.println(duration.toNanos()); // 731815594097103400
    }
}
