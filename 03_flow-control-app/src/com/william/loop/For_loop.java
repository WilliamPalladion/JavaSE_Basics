package com.william.loop;

public class For_loop {
    public static void main(String[] args) {
        // for (初始化语句; 循环条件; 迭代语句) { 循环体语句; }
        // Case 1: 重复输出3次HelloWorld
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }

        for (int i = 1; i <= 5; i += 2) {
            System.out.println("Hello World");
        }

        // Case: 求1-5的数据和
        int sum = 0;
        // 快捷键：fori + enter
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("和为：" + sum);


        // Case 2: 求1~10之间的奇数和
        // Method 1: 利用if
        int sum1 = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1){
                sum1 += i;
            }
        }
        System.out.println("1-10的奇数和为：" + sum1);

        // Method 2: 直接递加2
        int sum2 = 0;
        for (int i = 1; i <= 10; i+=2) {
            sum2 += i;
        }
        System.out.println("1-10的奇数和为：" + sum2);


        // Case 3: 输出所有的水仙花数：个十百位的数字的立方和等于原数字的三位数，并输出水仙花数的总个数
        int count = 0;
        for (int i = 100; i <= 999 ; i++) {
            // 提取三位数的个十百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.print(i + "\t"); // 打印在同一行，中间带空格
                count ++;
            }
        }
        System.out.println(); // 换行
        System.out.println("水仙花数的个数是: " + count);
    }
}
