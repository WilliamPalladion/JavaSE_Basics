package com.william.common_api.api_objects;

import java.util.Objects;

/** 2） Objects
 * Objects类与Object类还是继承关系，从 JDK 1.7 后开始出现
 * 官方在进行字符串比较时，没有用对象自己的equals方法，而是用了Objects的equals方法，结果一样但更安全 (null的情况)
 public static boolean equals(Object a, Object b): 比较两个对象，底层会先进行非空判断避免空指针异常，再调用对象的equals方法比较
 public static boolean isNull(Object obj): 判断变量是否为null
 */
public class ObjectsAPIDemo {
    public static void main(String[] args) {
        String s1 = "william";
        String s2 = "william";
        System.out.println(s1.equals(s2)); // true, String类也重写了equals方法，只比较内容

        // 但这种equals方法面对空值时会报错
        String s3 = null;
        String s4 = "william";
        System.out.println(s3.equals(s4)); // Error: s3 is null

        // 但调用Objects的equals方法更安全
        Objects.equals(s3, s4); // false

        /* 按住ctrl键再点击方法，可以看源码
        public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
        */

        System.out.println(Objects.isNull(s3)); // true
        System.out.println(s3 == null); // 从源码层面看一模一样
        System.out.println(Objects.isNull(s4)); // false
    }
}
