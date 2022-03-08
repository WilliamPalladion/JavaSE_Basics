package com.william.loop;

public class Chested_loop {
    public static void main(String[] args) {
        // 嵌套循环
        // Case: 5天每天3次说我爱你
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("我爱你");
            }
            System.out.println("----------------------");
        }

        // Case: 打印4行5列的*
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println(); // 换行
        }

    }
}
