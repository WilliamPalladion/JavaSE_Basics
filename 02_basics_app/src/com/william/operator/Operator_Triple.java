package com.william.operator;

public class Operator_Triple {
    public static void main(String[] args) {
        // 6. 三元运算符
        // 条件表达式 ? value1 : value2
        // 流程：首先计算条件表达式的值，为true返回value1，为false返回value2
        double score = 98;
        String rs = score >= 60 ? "合格" : "不合格";
        System.out.println(score);

        // Case: 从两个整数中找出最大值
        int m = 10;
        int n = 2000;
        int max = m > n ? m : n;
        System.out.println(max);

        // Case: 找出3个整数的最大值
        int c = 10;
        int d = 30;
        int e = 50;

        int temp = c > d ? c : d; // 取临时变量存储前两个数的较大值
        int rs2 = temp > e ? temp : e;
        System.out.println(rs2);

        // 嵌套三元运算符
        int rsMax1 = c > d ? (c > e ? c : e) : (d > e ? d : e);
        System.out.println(rsMax1);
    }
}
