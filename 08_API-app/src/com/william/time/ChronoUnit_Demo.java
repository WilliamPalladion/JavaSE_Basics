package com.william.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/** 14）ChronoUnit
 * java.time.temporal.ChronoUnit: 在单个时间单位内测量一段时间，可以用于比较所有的时间单位的最全工具类
 * ChronoUnit.xxx.between(): 调用ChronoUnit的一个枚举对象的方法计算时间差
 */

public class ChronoUnit_Demo {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime birthDate = LocalDateTime.of(1999, 2, 4, 20, 50, 30);
        System.out.println(birthDate);

        // 计算两个时间之间的差距
        System.out.println(ChronoUnit.YEARS.between(birthDate, today));
        System.out.println(ChronoUnit.MONTHS.between(birthDate, today));
        System.out.println(ChronoUnit.WEEKS.between(birthDate, today));
        System.out.println(ChronoUnit.DAYS.between(birthDate, today));
        System.out.println(ChronoUnit.HOURS.between(birthDate, today));
        System.out.println(ChronoUnit.MINUTES.between(birthDate, today));
        System.out.println(ChronoUnit.SECONDS.between(birthDate, today));
        System.out.println(ChronoUnit.MILLIS.between(birthDate, today));
        System.out.println(ChronoUnit.MICROS.between(birthDate, today));
        System.out.println(ChronoUnit.NANOS.between(birthDate, today));

        System.out.println(ChronoUnit.HALF_DAYS.between(birthDate, today)); // 半天数
        System.out.println(ChronoUnit.DECADES.between(birthDate, today));
        System.out.println(ChronoUnit.CENTURIES.between(birthDate, today));
        System.out.println(ChronoUnit.MILLENNIA.between(birthDate, today)); // 千年数
        System.out.println(ChronoUnit.ERAS.between(birthDate, today)); // 纪元数


    }
}
