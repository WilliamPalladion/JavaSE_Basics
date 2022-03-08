package com.william.operator;

public class OperatorCase1 {
    public static void main(String[] args) {
        // Case: 拆分3位数，把个位、十位、百位分别输出
        int data = 589;

        // 个位
        int ge = data % 10;
        System.out.println(ge);

        // 十位
        int shi = data / 10 % 10;
        System.out.println(shi);

        // 百位
        int bai = data / 100;
        System.out.println(bai);
    }
}
