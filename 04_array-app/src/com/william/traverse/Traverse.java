package com.william.traverse;

public class Traverse {
    public static void main(String[] args) {
        // 数组的遍历
        int[] arr = {12, 24, 12, 48, 98};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // arr.fori 数组遍历快捷键

        // Case: 某部门的5名员工的销售额为16, 26, 36, 6, 100, 求部门的销售总额
        int sum = 0;
        int[] sales = {16, 26, 36, 6, 100};

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        System.out.println("总销售额为：" + sum);
        
    }
}
