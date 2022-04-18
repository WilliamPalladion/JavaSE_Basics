package com.william.wrapper_class;

/** 包装类
 * Java为了实现一切皆对象，为8种基本类型提供了对应的引用类型
 * 后面的集合和泛型其实也只能支持包装类型，不支持基本数据类型

 基本数据类型	    引用数据类型
 byte			Byte
 short			Short
 int		    Integer
 long 			Long
 char			Character
 float			Float
 double			Double
 boolean		Boolean
 */

public class WrapperClass_Demo {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 11;
        System.out.println(a);
        System.out.println(a1);

        // 自动装箱：基本类型的数据/变量可以直接赋值给包装类型的变量
        Integer a2 = a;
        // 自动拆箱：包装类型的变量可以直接赋值给基本数据类型的变量
        Integer it = 100;
        int it1 = it;
        System.out.println(it1);

        // 包装类的特有功能：
        // 1）变量的默认值可以是null，容错率更高；
        Integer age = null;

        // 2）可以把基本类型的数据转换成字符串类型：toString(), xxx.toString()
        Integer i3 = 23;
        String rs = i3.toString();
        System.out.println(rs + 1); // 231

        String rs1 = Integer.toString(i3);
        System.out.println(rs1 + 1); // 231

        // 但开发中我们完全不需要这么干，直接拼接即可
        String rs2 = i3 + "";

        // 3) 可以把字符串类型的数据转换成真实的数据类型：
        //   Integer.parseInt("字符串类型的整数");
        //   Double.parseDouble("字符串类型的小数");
        //   xxx.valueOf(String s): 直接用valueOf方法调更加方便
        String number = "23";
        int age1 = Integer.parseInt(number);
        System.out.println(age1 + 1); // 24

        String number1 = "99.9";
        double score = Double.parseDouble(number1);
        System.out.println(score + 0.1); // 100.0

    }
}
