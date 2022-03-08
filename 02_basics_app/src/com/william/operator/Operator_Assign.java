package com.william.operator;

public class Operator_Assign {
    public static void main(String[] args) {
        // 3. 赋值运算符
        // 扩展赋值运算符：+=, -=, *=, /=, %=
        // a += b：a = (a的数据类型) (a + b); 将 a+b 的值赋给a

        int a = 10;
        int b = 200;
        // a = a + b;
        a += b; // a = (int) (a + b);
        System.out.println(a);

        // 这种赋值方法能够更简化一些特殊的情况
        byte i = 10;
        byte j = 20;
        // i = (byte) (i + j); 这个时候一定需要强制转换了，因为这个时候i和j都被当成int来计算
        i += j;
        System.out.println(i);

    }
}
