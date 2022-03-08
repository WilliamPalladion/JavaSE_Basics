package com.william.operator;

public class Operator_Logic {
    public static void main(String[] args) {
        // 5. 逻辑运算符
        // &：都是true才是true
        // |: 有一个true就是true
        // !: 取反
        // ^: 两个条件真假相反为true

        // Case: 尺寸大于等于6.95，内存大于等于8GB
        double size = 9.8;
        double storage = 16;
        System.out.println(size >= 6.95 & storage >= 8);

        // Case: 要么尺寸大于等于6.95，要么内存大于等于8GB
        System.out.println(size >= 6.95 | storage >= 8);

        // !
        System.out.println(!true); // false
        System.out.println(!false); // true

        // ^
        System.out.println(false ^ true); // true
        System.out.println(true ^ true); // false
        System.out.println(false ^ false); // false

        System.out.println("---------------------------------");

        // 短路逻辑运算符 (效率更高)
        // &&: 短路与，结果与&一样，如果左边是false，则右边不执行
        // ||: 短路或，结果与|一样，如果左边是true，则右边不执行
        int a = 10;
        int b = 20;
        System.out.println(a > 100 && ++b > 10); // false
        System.out.println(b); // 20，右边没有运行

        System.out.println(a > 100 & ++b > 10); // false
        System.out.println(b); // 21

        int i = 10;
        int j = 20;
        System.out.println(i > 2 || ++j > 10); // true
        System.out.println(j); // 20

    }
}
