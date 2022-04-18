package com.william.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/** LocalTime
 * 构造对象 (调用方法)：
 public static LocalDateTime now(): 根据当前日期、时间创建对象
 public static LocalDateTime of(...): 指定日期、时间创建对象

 * 常用方法：
 日期：getYear(), getMonthValue(), getDayOfMonth(), getDayOfYear(), getDayOfWeek();
 时间：getHour(), getMinute(), getSecond(), getNano()
 转换：toLocalDate(), toLocalTime(), LocalDateTime.of(LocalDate date, LocalTime time)
 比较时间：isAfter(), ifBefore()
 */


public class LocalDateTime_Demo {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("今天现在时刻是：" + nowDateTime);
        // 今天现在时刻是：2022-04-14T13:46:35.774840400

        // 年、月、日、时、分、秒、纳秒
        System.out.println(nowDateTime.getYear()); // 2022
        System.out.println(nowDateTime.getMonthValue()); // 4
        System.out.println(nowDateTime.getDayOfMonth()); // 14
        System.out.println(nowDateTime.getHour()); // 13
        System.out.println(nowDateTime.getMinute()); // 46
        System.out.println(nowDateTime.getSecond()); // 35
        System.out.println(nowDateTime.getNano()); // 774840400

        // 当年第几天、星期几、几月
        System.out.println(nowDateTime.getDayOfYear()); // 104

        System.out.println(nowDateTime.getDayOfWeek()); // THURSDAY
        System.out.println(nowDateTime.getDayOfWeek().getValue()); // 4

        System.out.println(nowDateTime.getMonth()); // APRIL
        System.out.println(nowDateTime.getMonth().getValue()); // 4

        // LocalDateTime.of(): 指定日期、时间创建对象
        // LocalDateTime.of(LocalDate date, LocalTime time) 也可以生成
        System.out.println(LocalDateTime.of(1999, 2, 4, 8, 50, 10050));
        System.out.println(LocalDateTime.of(1999, Month.APRIL, 4, 8, 50, 10050));

        // LocalDateTime 转换成 LocalDate/LocalTime
        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);
        System.out.println(ld.getYear());

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt);
        System.out.println(lt.getHour());
    }
}
