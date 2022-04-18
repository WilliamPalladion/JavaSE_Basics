package com.william.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

/** 修改/比较时间相关方法：
 * LocalDateTime 综合了 LocalDate 和 LocalTime 中的方法，这些方法返回的是一个新的实例引用对象 (不可变类型)

 * 常用方法：
 plusDays, plusWeeks, plusMonths, plusYears: 添加时间
 minusDays, minusWeeks, minusMonths, minusYears: 减去时间
 withDayOfMonth, withDayOfYear, withMonth, withYear: 直接修改为指定的值并返回新的对象
 isBefore, isAfter, equals: 比较前后
 * */
public class UpdateTime_Demo {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        // 21:49:05.327912800

        // 添加、减去时间
        System.out.println(nowTime.plusHours(1)); // 22:49:05.327912800
        System.out.println(nowTime.plusMinutes(1)); // 21:50:05.327912800
        System.out.println(nowTime.plusSeconds(1)); // 21:49:06.327912800
        System.out.println(nowTime.plusNanos(1)); // 21:49:05.327912801

        System.out.println("-------------------------------");

        System.out.println(nowTime.minusHours(1)); // 20:49:05.327912800
        System.out.println(nowTime.minusMinutes(1)); // 21:48:05.327912800
        System.out.println(nowTime.minusSeconds(1)); // 21:49:04.327912800
        System.out.println(nowTime.minusNanos(1)); // 21:49:05.327912799

        System.out.println("-------------------------------");
        // 比较日期/时间
        LocalDate nowDate = LocalDate.now();
        LocalDate myDate = LocalDate.of(2018, 9, 5);

        System.out.println("今天是2018-09-05吗？ " + nowDate.equals(myDate)); // false
        System.out.println(myDate + "是否在" + nowDate + "之前？ " + myDate.isBefore(nowDate)); // true
        System.out.println(myDate + "是否在" + nowDate + "之后？ " + myDate.isAfter(nowDate)); // false

        System.out.println("-------------------------------");

        // 判断今天是否是你的生日
        LocalDate birthDate = LocalDate.of(1999, 2, 4);
        LocalDate nowDate1 = LocalDate.now();

        // 我们可以用 MonthDay 这个API来提取月和日的信息
        MonthDay birthMd = MonthDay.of(birthDate.getMonthValue(), birthDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);

        System.out.println("今天是否是你的生日？ " + birthDate.equals(nowMd)); // false
    }
}
