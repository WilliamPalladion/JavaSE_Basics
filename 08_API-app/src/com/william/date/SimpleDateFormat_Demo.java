package com.william.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 8） SimpleDateFormat
 * 可以把Date对象/时间毫秒值 格式化 成我们需要的时间形式，也可以将字符串的时间形式解析成日期对象
 * 格式：y M d H m s (年月日时秒分), EEE: 星期几, a: 上下午

 * 构造器
 public SimpleDateFormat(): 默认格式创建一个SimpleDateFormat对象
 public SimpleDateFormat(String pattern): 指定格式创建一个SimpleDateFormat对象

 * 常用格式化/解析字符串方法：
 public final String format(Date date): 将日期格式转化成日期/时间字符串
 public final String format(Object date): 将时间毫秒值转化成日期/时间字符串

 public Date parse(String source): 根据给定的字符串解析文本生成日期对象
 */

public class SimpleDateFormat_Demo {
    public static void main(String[] args) throws ParseException {
        // 1. 格式化日期对象
        Date d = new Date();
        System.out.println(d);
        // Wed Apr 13 12:36:06 CST 2022

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String rs = sdf.format(d);
        System.out.println(rs);
        // 2022年04月13日 12:36:06 周三 下午

        // 2. 格式化时间毫秒值
        // Case: 121秒后的时间是多少
        long time1 = System.currentTimeMillis() + 121 * 1000;
        String rs2 = sdf.format(time1);
        System.out.println(rs2);

        // 3. 解析字符串时间
        // Case: 计算 2021年08月06日 11:11:11，往后走2天14小时49分06秒后的时间是多少
        String dateStr = "2021年08月06日 11:11:11";

        // 注意：解析的形式必须与被解析时间的形式完全一致！否则会报错
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1 = sdf1.parse(dateStr); // 这里是Java的异常机制在提醒你注意有没有写对格式 (按 alt + enter剔除)，看上方添加了throws ParseException
        System.out.println(d1);

        // 注意我们加了一个L是为了防止超过int类型的范围
        long time = d1.getTime() + (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 * 60 + 6) * 1000;
        System.out.println(sdf.format(time));


        // Case: 某秒杀活动时间为 2020年11月11日 00:00:00 ~ 2020年11月11日 00:10:00
        // 两位用户下单的时间为：2020年11月11日 00:03:47，2020年11月11日 00:10:11，判断他们有没有成功参加上述活动
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String startTime = "2020年11月11日 00:00:00";
        String endTime = "2020年11月11日 00:10:00";

        String customer1 = "2020年11月11日 00:03:47";
        String customer2 = "2020年11月11日 00:10:11";

        // 解析时间
        Date start = sdf2.parse(startTime);
        Date end = sdf2.parse(endTime);
        Date cus1 = sdf2.parse(customer1);
        Date cus2 = sdf2.parse(customer2);

        if (cus1.after(start) && cus1.before(end)) {
            System.out.println("Customer 1 秒杀成功！");
        } else {
            System.out.println("Customer 1 秒杀失败！");
        }

        if (cus2.after(start) && cus2.before(end)) {
            System.out.println("Customer 2 秒杀成功！");
        } else {
            System.out.println("Customer 2 秒杀失败！");
        }


    }
}
