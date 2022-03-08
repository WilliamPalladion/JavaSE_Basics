package com.william.operator;

public class Operator_Arithmetic {
    public static void main(String[] args) {
        // 1. 算数运算符
        // + - * / %(取余)
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 3.3333... -> 3, 注意在Java中两个整数型相除结果还是 整数型 (最高类型)
        System.out.println(a % b); // 1

        // 如果一定需要准确的带小数的结果，可以 * 1.0
        System.out.println(3 / 2); // 1
        System.out.println(3 * 1.0 / 2); // 1.5
        System.out.println(3 / 2 * 1.0); // 1.0, 注意 * 要放在前面！ 否则已经先变成1就无效了

        System.out.println(a * 1.0 / b); // 3.3333333333333335

        // '+' 做连接符号
        // 能算则算，不能算就连起来
        int i = 5;
        System.out.println("abc" + 'i'); // abci
        System.out.println("abc" + i); // abc5
        System.out.println("abc" + 5 + 'i'); // abc5i
        System.out.println(15 + "abc" + 15); // 15abc15

        System.out.println(i + 'a'); // 5 + 97 = 102, 注意此时 'a' 在ASCII编码表为97，所以可以算
        System.out.println(i + "" + 'a'); // i + "" = "5", 5a
        System.out.println(i + 'a' + " william "); // 102 william
        System.out.println("william" + i + 'a'); // william5a
        System.out.println("william" + (i + 'a')); // 括号有优先级，所以是 william102

    }
}
