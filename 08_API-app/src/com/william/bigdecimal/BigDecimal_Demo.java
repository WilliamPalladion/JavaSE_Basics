package com.william.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/** 6） BigDecimal
 * 用于解决浮点型运算精度失真的问题

 * 创建BigDecimal对象封装浮点型数据 (最好的是调用方法)
 new BigDecimal(String str)
 public static BigDecimal valueOf(double val)

 * 常用方法：
 public BigDecimal add(BigDecimal b)
 public BigDecimal subtract(BigDecimal b)
 public BigDecimal multiply(BigDecimal b)
 public BigDecimal divide(BigDecimal b)
 public BigDecimal divide(BigDecimal b, 精确位数，舍入模式)
 */

public class BigDecimal_Demo {
    public static void main(String[] args) {
        // 精度失真问题
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);

        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);

        // 包装浮点型数据成为BigDecimal对象
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1); // 0.3

        System.out.println(a1.subtract(b1)); // -0.1
        System.out.println(a1.multiply(b1)); // 0.02
        System.out.println(a1.divide(b1)); // 0.5

        // 但注意BigDecimal只是手段，不是目的，我们还是要转换成double类型
        double rs = c1.doubleValue();
        System.out.println(rs); // 0.3

        // 注意：BigDecimal是一定要精度运算的，如果除不尽会报错，所以有时候要指定模式
        BigDecimal a2 = BigDecimal.valueOf(10.0);
        BigDecimal b2 = BigDecimal.valueOf(3.0);
        BigDecimal c2 = a2.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println(c2); // 3.33


    }
}
