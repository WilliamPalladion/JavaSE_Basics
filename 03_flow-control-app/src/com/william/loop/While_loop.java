package com.william.loop;

public class While_loop {
    public static void main(String[] args) {
        // 初始化语句;
        // while (循环条件){ 循环体语句; 迭代语句;}

        // Case 1: 输出Hello World三次
        int i = 0;
        while (i < 3){
            System.out.println("Hello World");
            i++; // 如果没有迭代就会死循环
        }


        // Case 2: 珠穆朗玛峰高度为 8848.86m = 8848860mm，一张纸的厚度为0.1mm，折叠几次可以超过它？
        int count = 0;
        double peakheight = 8848860;
        double paperThickness = 0.1;

        while (paperThickness < peakheight){
            paperThickness *= 2;
            count++;
        }
        System.out.println("需要折叠" + count + "次");
        System.out.println("纸张的最终厚度为：" + paperThickness);

        // 当然其实用for也可写，但格式不美观
        for ( ;paperThickness < peakheight; ){
            paperThickness *= 2;
            count++;
        }
    }
}
