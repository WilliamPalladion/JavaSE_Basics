package com.william.cases;

/* Case 2: 寻找101-200之间的素数
   素数：除1和本身外，不能被其他正整数整除的数
   判断规则：从2遍历到该数的一半，看看是否有数据可以整除它 (严格来说，只要遍历到它的平方根即可)
*/

public class CaseDemo2 {
    public static void main(String[] args) {
        for (int i = 101; i <= 200 ; i++) {
            // 判断当前数据是否是素数
            // 利用一个信号位来标记
            boolean flag = true; // 开始先认为是素数
            for (int j = 2; j < i / 2 ; j++) {
                if (i % j == 0){
                    flag = false; // 非素数则修改信号位
                    break;
                }
            }
            // 若是素数就输出这个数据
            if (flag){
                System.out.print(i + "\t");
            }
        }
    }
}
