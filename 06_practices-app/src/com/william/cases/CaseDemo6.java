package com.william.cases;

import java.util.Scanner;

/* Case 6: 数字加密
   规则：先得到每位数，然后每位数都加上5，再对10求余，最后所有数字翻转，得到新数
*/
public class CaseDemo6 {
    public static void main(String[] args) {
        // 将每位数据存入到数组中去，遍历数组更改，再重新存入数组交换
        System.out.println("请您输入需要加密的数字个数：");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请您输入需要加密的第" + (i + 1) + "个数字：");
            int number = sc.nextInt();
            arr[i] = number;
        }
        printArray(arr);

        // 加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        // 反转, 定义i, j两个变量，一个往前，一个往后
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // 交换两者的值
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        printArray(arr);

    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i]: arr[i] + ", ");
        }
        System.out.println("}");
    }
}
