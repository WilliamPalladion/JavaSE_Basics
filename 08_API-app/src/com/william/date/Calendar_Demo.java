package com.william.date;

import java.util.Calendar;
import java.util.Date;

/** 9） Calendar
 * Calendar代表了系统此刻日期对应的日历对象
 * Calendar是一个抽象类，不能直接创建对象；且日历是可变日期对象，一旦修改其对象本身表示的时间将变化

 * 调用方法来获取一个对象(类似之前说的单例，其实也是一种多态的写法)：Calendar.getInstance()

 * 常用方法：
 public int get(int field): 取日期中的某个字段信息
 public void set(int field, int value): 修改日期中的某个字段信息
 public void add(int field, int value): 为日期的某个字段增加/减少指定的值
 public final Date getTime(): 拿到此刻日期对象
 public long getTimeInMillis: 拿到此刻时间的毫秒值
 */

public class Calendar_Demo {
    public static void main(String[] args) {
        // 1. 拿到一个日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal); // 日历信息
        // java.util.GregorianCalendar[time=1649827608272,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
        // zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,
        // transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
        // YEAR=2022,MONTH=3,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=103,DAY_OF_WEEK=4,
        // DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=26,SECOND=48,MILLISECOND=272,ZONE_OFFSET=28800000,DST_OFFSET=0]

        // 2. 获取日历信息
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);

        // 注意Month是从0开始计数，所以最好+1
        int mm = cal.get(Calendar.MONTH) + 1;
        System.out.println(mm);

        int days = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);

        // 3. 修改日历的某个字段信息 (一般少用)
        // cal.set(Calendar.HOUR, 12);
        // System.out.println(cal);

        // 4. 为日期的某个字段增加/减少指定的值
        // Case: 请问64天后是什么时间
        cal.add(Calendar.DAY_OF_YEAR, 64);
        cal.add(Calendar.MINUTE, 64);

        // 5. 拿到此刻日期对象
        Date d = cal.getTime();
        System.out.println(d);

        // 6. 拿到此刻时间的毫秒值
        long time = cal.getTimeInMillis();
        System.out.println(time);
    }
}
