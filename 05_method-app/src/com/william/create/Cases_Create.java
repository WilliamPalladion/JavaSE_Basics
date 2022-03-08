package com.william.create;

public class Cases_Create {
    public static void main(String[] args) {
        // Case 1
        System.out.println("1-5的和是：" + sum(5));
        System.out.println("1-100的和是：" + sum(100));

        // Case 2
        check(11);
        check(100);

        // Case 3:
        int[] ages = {23, 19, 25, 78, 34};
        int max = getArrayMaxData(ages);
        System.out.println("最大值数据是：" + max);
    }

    // Case 1: 计算1-n的和并返回
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Case 2: 判断整数的奇偶性并输出
    public static void check(int number){
        if (number % 2 == 0){
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "是奇数");
        }
    }

    // Case 3: 求数组最值的方法实现
    public static int getArrayMaxData(int[] arr){
        // 注意这时候传给arr的是一个数组的地址，相当于两个变量指向同一个数组对象
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
